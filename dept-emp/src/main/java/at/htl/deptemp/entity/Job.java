package at.htl.deptemp.entity;

import javax.persistence.*;

@Entity
public class Job  {
    @Id
    @SequenceGenerator(
            name = "jobSequence",
            sequenceName = "job_id_seq",
            initialValue = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jobSequence")
    private Long id;

    @Column(name = "JOB_TITLE")
    private String jobTitle;
    @Column(name = "JOB_DESCRIPTION")
    private String jobDescription;

    public Job() {
    }

    public Job(String jobTitle, String jobDescription) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
