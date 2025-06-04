package com.SerializationPractice3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Address {

    String street;
    String city;
    String zipcode;
}
