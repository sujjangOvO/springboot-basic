package com.prgms.voucher.voucherproject.domain.customer;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.UUID;

public class Customer {
    private final UUID customerId;
    private final String email;
    private String name;
    private final LocalDateTime createdAt;

    public Customer(String email, String name) {
        this.validateName(name);
        this.customerId = UUID.randomUUID();
        this.email = email;
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public Customer(UUID customerId, String email, String name, LocalDateTime createdAt) {
        this.validateName(name);
        this.customerId = customerId;
        this.email = email;
        this.name = name;
        this.createdAt = createdAt;
    }

    public void changeName(String name) {
        this.validateName(name);
        this.name = name;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        if (name.isBlank()) {
            throw new InputMismatchException("이름을 입력해야 합니다.");
        }
    }

}
