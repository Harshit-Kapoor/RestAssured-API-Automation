package com.SerializationPractice2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor

public class Departments {

    String name;
    String hod;
    List<Courses> courses;
}
