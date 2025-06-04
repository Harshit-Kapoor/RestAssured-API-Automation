package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
//@AllArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Builder
public class Teacher {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Teacher(int id, String firstName, String lastName, String email) {
    }

    //public static String address;

    // 2 . Static inner class = this can also be set by lombok

/*    public static class TeacherBuilder1 {
        private int id;
        private String firstName;
        private String lastName;
        private String email;

        public static TeacherBuilder1 builder() {
            return new TeacherBuilder1();
        }

        public TeacherBuilder1 setId(int id) {
            this.id = id;
            return this;
        }

        public TeacherBuilder1 setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public TeacherBuilder1 setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public TeacherBuilder1 setEmail(String email) {
            this.email = email;
            return this;
        }

        public Teacher build() {
            return new Teacher(this.id, this.firstName, this.lastName, this.email);
        }
    }

 */
}
