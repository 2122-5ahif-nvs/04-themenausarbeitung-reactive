package at.htl.boundary;

import at.htl.control.EmployeeRepository;
import at.htl.entity.Employee;
import io.smallrye.mutiny.Multi;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeResource {
    @Inject
    EmployeeRepository employeeRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Employee> getAllEmployees() {
        return employeeRepository.streamAll();
    }
}
