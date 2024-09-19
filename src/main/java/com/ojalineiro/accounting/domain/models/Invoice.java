package com.ojalineiro.accounting.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Invoice {
    private Long id;
    private Double amount;
    private String description;
    private LocalDateTime createdAt;
    private Member payer;
}
