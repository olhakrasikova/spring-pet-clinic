package com.spring.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;
}
