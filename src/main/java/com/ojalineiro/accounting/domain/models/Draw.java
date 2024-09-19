package com.ojalineiro.accounting.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;

@Data
@NoArgsConstructor
public class Draw {
    private Long id;
    private String description;
    private HashMap<Integer,Member> drawInfo;
    private LocalDateTime createdAt;
    private int winner;
}
