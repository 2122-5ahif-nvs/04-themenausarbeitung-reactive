package at.htl.deptemp.control;

import at.htl.deptemp.entity.Employee;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {

    @Transactional
    public Uni<Integer> update(Employee employee) {
        return update("commission = ?1, manager_id = ?2, job_id = ?3, department_id = ?4, sal = ?5, " +
                "name = ?6, hire_date = ?7 where id = ?8",
                employee.getCommission(), employee.getManager().getId(), employee.getJob().getId(),
                employee.getDepartment().getId(), employee.getSal(), employee.getName(), employee.getHireDate(),
                employee.getId());
    }
}
