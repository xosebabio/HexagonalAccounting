package com.ojalineiro.accounting.domain.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
public class Income {
    private Long id;
    private Double amount;
    private String description;
    private LocalDateTime createdAt;
    private Person payer;
}
