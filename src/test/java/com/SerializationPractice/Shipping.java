package com.SerializationPractice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Shipping {

    Address address;
    String method;
    String trackingNumber;

}
