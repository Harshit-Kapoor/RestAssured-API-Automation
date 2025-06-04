package com.SerializationPractice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Orders {

    String orderId;
    String orderDate;
    Customer customer;

    List<Items> items;

    Shipping shipping;

    String status;

}
