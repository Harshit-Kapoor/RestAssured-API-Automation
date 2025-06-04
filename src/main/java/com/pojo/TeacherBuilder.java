package com.pojo;

public class TeacherBuilder {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public TeacherBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public TeacherBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public TeacherBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public TeacherBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public TeacherBuilder builder() {
        return this;
    }
    public TeacherBuilder and() {
        return this;
    }
    public TeacherBuilder with() {
        return this;
    }

    public Teacher build() {
        return new Teacher(this.id, this.firstName, this.lastName, this.email);
    }

}
