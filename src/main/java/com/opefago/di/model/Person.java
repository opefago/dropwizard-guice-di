package com.opefago.di.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
