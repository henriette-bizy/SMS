package com.example.javaeeexample.Models;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student-id")
    private Long id;
    @Column(name = "first-name", nullable = false,length = 120)
    private String firstName;
    @Column(name = "last-name", nullable = false)
    private String lastName;
    @Column(name = "gender", nullable = false)
    private String gender;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Student(String firstName,String lastName,String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender= gender;
    }

    public Student(Long valueOf) {

        this.id = valueOf;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
