package com.andersenland.bank_app_23.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class AccountDto {
    String id;
    String name;
    String clientFirstName;
    String clientLastName;
    String type;
    String status;
    String balance;
    String currencyCode;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDateTime createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDateTime updatedAt;
}
