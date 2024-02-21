package jpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String title;
    private String category;
    private String priority;
    private String status;
    private Date creationDate;
    private Date affectationDate;
    private Date resolutionDate;

    private Long user_id;
    private Long support_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "support_id")
    private Support support;


}
