package com.andersenland.bank_app_23.mapper;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UuidMapper {
    String toString(UUID uuid) {
        return uuid.toString();
    }
    UUID fromString(String uuid) {
        return UUID.fromString(uuid);
    }
}
