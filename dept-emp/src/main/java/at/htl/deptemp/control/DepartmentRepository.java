package at.htl.deptemp.control;

import at.htl.deptemp.entity.Department;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DepartmentRepository implements PanacheRepository<Department> {
}
