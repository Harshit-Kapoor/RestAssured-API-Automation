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
public class University {

    String university;
    String location;
    List<Departments> departments;
}
