package jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private List<Ticket> tickets;

    public User(String firstName, String lastName, String email, List<Ticket> tickets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tickets = new ArrayList<Ticket>();
    }

    public User() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @OneToMany
    public List<Ticket> getTickets() {
        return new ArrayList<Ticket>(tickets);

    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
