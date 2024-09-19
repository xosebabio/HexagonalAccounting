package com.ojalineiro.accounting.domain.models;

import java.time.LocalDateTime;


public class Member {
    private Long id;
    private String name;
    private String surname;
    private String cardIdNumber;
    private LocalDateTime createdAt;
    private boolean paid;

    public Member() {
    }

    public Member(Long id, String name, String surname, String cardIdNumber, LocalDateTime createdAt, boolean paid) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.cardIdNumber = cardIdNumber;
        this.createdAt = createdAt;
        this.paid = paid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCardIdNumber() {
        return cardIdNumber;
    }

    public void setCardIdNumber(String cardIdNumber) {
        this.cardIdNumber = cardIdNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}


