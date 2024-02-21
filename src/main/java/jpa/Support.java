package jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Support {
    @Id
    @GeneratedValue
    private Long support_id;
    private String firstName;
    private String lastName;
    private String email;


    @OneToMany
    private List<Ticket> tickets;

    @ManyToMany(mappedBy = "supports")
    private List<Department> departments;



    public Support(String firstName, String lastName, String email , List<Department> department ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.departments = departments;
    }

    public Support() {

        List<Department> departments = new ArrayList<>();
    }



    public Long getSupport_id() {
        return support_id;
    }

    public void setSupport_id(Long id) {
        this.support_id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public List<Department>  getDepartment() {
        return departments;
    }


    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
