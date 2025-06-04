package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//@Getter
//@Setter
//@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
//@JsonIgnoreProperties(value = {"email"})
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
//    @JsonIgnore
    private String email;
    private FavouriteFoods favouriteFoods;
    private List<String> jobs;
    private List<Marks> marks;

    public Employee () {

    }

    public Employee(int id, String firstName, String lastName, String email, FavouriteFoods favouriteFoods, List<String> jobs, List<Marks> marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.favouriteFoods = favouriteFoods;
        this.jobs = jobs;
        this.marks = marks;
    }

    public List<Marks> getMarks() {
        return marks;
    }

    public void setMarks(List<Marks> marks) {
        this.marks = marks;
    }

    public FavouriteFoods getFavouriteFoods() {
        return favouriteFoods;
    }

    public void setFavouriteFoods(FavouriteFoods favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
    }

    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "default name";
        }

    }

    // setters should not be made as they make out objects mutable, we should set using constructor only

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

}
