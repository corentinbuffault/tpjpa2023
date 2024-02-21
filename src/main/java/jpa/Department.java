package jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Department {
    @Id
    @GeneratedValue
    private Long department_id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "Departement_Support",
            joinColumns = @JoinColumn(name = "department_id"),
            inverseJoinColumns = @JoinColumn(name = "support_id")
    )
    private List<Support> supports;
    public Department(String name) {
        this.name = name;
    }

    public Department() {
        supports = new ArrayList<Support>();
    }


}
