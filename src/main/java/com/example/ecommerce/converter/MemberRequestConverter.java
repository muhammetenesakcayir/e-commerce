package com.example.ecommerce.converter;

import com.example.ecommerce.domain.Member;
import com.example.ecommerce.request.MemberCreateRequest;
import com.example.ecommerce.util.PasswordEncryptionService;
import org.springframework.stereotype.Component;

@Component
public class MemberRequestConverter {

    private final PasswordEncryptionService passwordEncryptionService;

    public MemberRequestConverter(PasswordEncryptionService passwordEncryptionService) {
        this.passwordEncryptionService = passwordEncryptionService;
    }

    public Member convert(MemberCreateRequest request) {
        var member = new Member();
        member.setEmail(request.getEmail());
        member.setUsername(request.getUsername());
        member.setTcId(request.getTcId());
        String password = request.getPassword();
        var newPassword = passwordEncryptionService.encrypt(password);
        member.setPassword(newPassword);
        return member;
    }
}
