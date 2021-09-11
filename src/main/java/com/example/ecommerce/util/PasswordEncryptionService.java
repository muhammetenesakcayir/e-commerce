package com.example.ecommerce.util;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PasswordEncryptionService {

    public String encrypt(String password) {
        var uuid = UUID.randomUUID().toString();
        var substring = password.substring(0, 3);
        return uuid.concat(substring);
    }

    public String dencrypt(String password) {
        var uuid = UUID.randomUUID().toString();
        var substring = password.substring(3, 0);
        return uuid.concat(substring);
    }
}
