package at.htl.control;

import at.htl.entity.Department;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DepartmentRepository implements PanacheRepository<Department> {
}
