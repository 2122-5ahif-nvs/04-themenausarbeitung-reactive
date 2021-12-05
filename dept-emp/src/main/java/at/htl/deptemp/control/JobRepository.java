package at.htl.deptemp.control;
import at.htl.deptemp.entity.Job;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JobRepository implements PanacheRepository<Job> {
}
