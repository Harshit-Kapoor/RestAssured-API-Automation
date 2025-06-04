package com.SerializationPractice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestOrder {

    @Test
    public void testOrder() {

        // Step 1: Build test data
        Customer customer = Customer.builder()
                .customerId(789)
                .name("John Doe")
                .email("john.doe@example.com")
                .build();

        Items item1 = Items.builder()
                .productId("P1001")
                .productName("Wireless Mouse")
                .quantity(2)
                .price(25.99)
                .build();

        Items item2 = Items.builder()
                .productId("P1002")
                .productName("USB-C Charger")
                .quantity(1)
                .price(19.99)
                .build();

        Address address = Address.builder()
                .street("123 Main St")
                .city("New York")
                .zip("10001")
                .build();

        Shipping shipping = Shipping.builder()
                .address(address)
                .method("Express")
                .trackingNumber("TRK987654321")
                .build();

        Orders order = Orders.builder()
                .orderId("ORD123456")
                .orderDate("2025-04-20T10:15:30Z")
                .customer(customer)
                .items(Arrays.asList(item1, item2))
                .shipping(shipping)
                .status("Shipped")
                .build();

        // Step 2: Send POST request and deserialize response into Orders.class
        RestAssured.baseURI = "https://yourapi.com"; // Replace with actual base URI

        Orders returnedOrder = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(order)
                .when()
                .post("/api/orders") // Replace with actual path
                .then()
                .statusCode(201)
                .extract()
                .as(Orders.class); // 👈 Deserialization happens here

        // Step 3: Validate returned order
        Assert.assertEquals(returnedOrder.getOrderId(), "ORD123456", "Order ID should match");
        Assert.assertEquals(returnedOrder.getCustomer().getName(), "John Doe", "Customer name should match");
        Assert.assertEquals(returnedOrder.getItems().size(), 2, "Should return 2 items");
        Assert.assertEquals(returnedOrder.getShipping().getMethod(), "Express", "Shipping method should be Express");

        System.out.println("Order validated using deserialized response.");
    }
}
