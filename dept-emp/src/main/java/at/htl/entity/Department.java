package at.htl.entity;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @SequenceGenerator(
            name = "departmentSequence",
            sequenceName = "department_id_seq",
            initialValue = 60)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departmentSequence")
    private Long id;
    private String name;
    private String location;

    public Department() {
    }

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
