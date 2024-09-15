package com.ojalineiro.accounting.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String surname;
}
