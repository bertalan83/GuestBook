package hu.progmatic.guestbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String comment;
    private LocalDate date;

    public Review() {
    }

    public Review(LocalDate date) {
        this.date = date;
    }

    public Review(String firstName, String lastName, String comment, LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.comment = comment;
        this.date = date;
    }

    public Review(Long id, String firstName, String lastName, String comment, LocalDate date) {
        this(firstName, lastName, comment, date);
        this.id = id;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String review) {
        this.comment = review;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
