package com.ojalineiro.accounting.domain.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Member extends Person{
    private String cardIdNumber;
    private LocalDateTime createdAt;
    private boolean paid;
}
