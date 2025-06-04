package com.SerializationPractice2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.Arrays;

public class UniTest {

    @Test
    public void testUniversity() throws JsonProcessingException {

        Courses courses = Courses
                .builder()
                .code("Intro to Programming")
                .title("CS101")
                .credits(32)
                .build();


        Courses courses1 = Courses
                .builder()
                .code("Intro to DSA")
                .title("CS102")
                .credits(31)
                .build();


        Departments departments = Departments
                .builder()
                .name("name")
                .hod("hod name")
                .courses(Arrays.asList(courses, courses1))
                .build();

        Departments departments1 = Departments
                .builder()
                .name("name")
                .hod("hod name")
                .courses(Arrays.asList(courses, courses1))
                .build();

        University university = University.builder()
                .university("name of uni")
                .location("place")
                .departments(Arrays.asList(departments, departments1))
                .build();

        // Serialize
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(university);

        System.out.println(json);


    }
}
