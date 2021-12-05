package at.htl.deptemp.boundary;

import at.htl.deptemp.control.EmployeeRepository;
import at.htl.deptemp.entity.Employee;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.time.Duration;

@Path("/employees")
public class EmployeeResource {
    @Inject
    EmployeeRepository employeeRepository;

       @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Employee> getAllEmployees() {
        return employeeRepository.streamAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Employee> getEmployeeById(@PathParam("id") Long id) {
        return employeeRepository.findById(id).onItem().delayIt().by(Duration.ofMillis(1000));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> addEmployee(Employee employee, @Context UriInfo info) {
        return Panache.withTransaction(() -> employeeRepository.persist(employee))
                .onItem()
                .transform(inserted -> Response
                        .created(info
                                .getAbsolutePathBuilder()
                                .path(Long.toString(inserted.getId())).build())
                        .build());
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> updateEmployee(Employee employee) {
        return Panache.withTransaction(() -> employeeRepository.update(employee))
                .onItem().ifNotNull().transform(entity -> Response.ok(employee).build());
    }
}
