package com.springboot.webapplication.entity;



import jdk.jfr.Timestamp;
import org.hibernate.cfg.annotations.reflection.internal.XMLContext;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="authors")
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;

    private String lastName;

    private LocalDateTime dateOfBirth;

   // @Temporal(TemporalType.TIMESTAMP)
    //@GeneratedValue(strategy = )
    private LocalDateTime regestrationDate;

    private String aboutme;

    @Email
    private String email;

    private String password;

    private String phoneNumber;

    private Image authorImage;


    public Author(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    /*this is the used one*/
    public Author(String firstName, String lastName, LocalDateTime dateOfBirth,
                  String aboutme, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

        this.aboutme = aboutme;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//    public Author(String firstName, String lastName, LocalDateTime dateOfBirth, String aboutme,
//                  String email, String phoneNumber, Image authorImage) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//        this.aboutme = aboutme;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }

    public Author(long id, String firstName, String lastName, LocalDateTime dateOfBirth,
                  LocalDateTime regestrationDate, String aboutme,
                  String email, String phoneNumber,Image authorImage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.aboutme = aboutme;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.authorImage=authorImage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getFullName(){return this.firstName+this.lastName;}

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth( LocalDateTime  dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getRegestrationDate() {
        return regestrationDate;
    }

    public void setRegestrationDate(LocalDateTime regestrationDate) {
        this.regestrationDate = regestrationDate;
    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", regestrationDate=" + regestrationDate +
                ", aboutme='" + aboutme + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Image getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(Image authorImage) {
        this.authorImage = authorImage;
    }
}
