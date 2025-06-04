package com.SerializationPractice3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.Arrays;

public class UserTest {

    @Test
    public void userTest() throws JsonProcessingException {
        // Create Address objects
        Address homeAddress = Address.builder()
                .street("123 Main St")
                .city("New York")
                .zipcode("10001")
                .build();

        Address workAddress = Address.builder()
                .street("456 Office Rd")
                .city("Los Angeles")
                .zipcode("90001")
                .build();

        // Create Addresses object
        Addresses addresses = Addresses.builder()
                .home(homeAddress)
                .work(workAddress)
                .build();

        // Create Contacts list
        Contacts emailContact = Contacts.builder()
                .type("email")
                .details("john.doe@example.com")
                .build();

        Contacts phoneContact = Contacts.builder()
                .type("phone")
                .details("+1234567890")
                .build();

        // Create Roles list
        Roles adminRole = Roles.builder()
                .roleName("Admin")
                .permissions(Arrays.asList("READ", "WRITE", "DELETE"))
                .build();

        Roles userRole = Roles.builder()
                .roleName("User")
                .permissions(Arrays.asList("READ"))
                .build();

        // Build the User object
        User user = User.builder()
                .id("101")
                .name("John Doe")
                .contacts(Arrays.asList(emailContact, phoneContact))
                .addresses(addresses)
                .roles(Arrays.asList(adminRole, userRole))
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);

        System.out.println(json);
    }
}
