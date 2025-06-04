package com.SerializationPractice3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Roles {

    String roleName;

    List<String> permissions;
}
