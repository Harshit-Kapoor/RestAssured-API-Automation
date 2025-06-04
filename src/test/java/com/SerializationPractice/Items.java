package com.SerializationPractice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Items {

    String productId;
    String productName;
    int quantity;
    double price;

}
