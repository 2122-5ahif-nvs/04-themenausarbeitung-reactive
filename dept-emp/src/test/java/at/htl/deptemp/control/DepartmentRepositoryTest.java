package at.htl.deptemp.control;

import at.htl.deptemp.control.DepartmentRepository;
import at.htl.deptemp.entity.Department;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class DepartmentRepositoryTest {
    @Inject
    DepartmentRepository departmentRepository;
    @Test
    @Transactional
    public void testStreamAll() {
        var departments = departmentRepository.streamAll().subscribe().asIterable();
        List<Long> ids = List.of(10L,20L,30L,40L) ;
        for(Department d : departments) {
            assertTrue(ids.contains(d.getId()));
        }
    }
}