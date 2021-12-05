package at.htl.deptemp.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employeeSequence",
            sequenceName = "employee_id_seq",
            initialValue = 8000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeeSequence")
    private Long id;
    private String name;

    @ManyToOne
    private Department department;
    @ManyToOne
    private Job job;

    @ManyToOne
    private Employee manager;

    @Column(name = "hire_date")
    private LocalDate hireDate;
    private int sal;
    @Column(nullable = true)
    private Integer commission;

    public Employee() {
    }

    public Employee(String name, Department department, Job job, Employee manager, LocalDate hireDate, int sal, int commission) {
        this.name = name;
        this.department = department;
        this.job = job;
        this.manager = manager;
        this.hireDate = hireDate;
        this.sal = sal;
        this.commission = commission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", job=" + job +
                ", manager=" + manager +
                ", hireDate=" + hireDate +
                ", sal=" + sal +
                ", commission=" + commission +
                '}';
    }
}
