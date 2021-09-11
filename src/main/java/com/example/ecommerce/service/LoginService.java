package com.example.ecommerce.service;

import com.example.ecommerce.domain.Member;
import com.example.ecommerce.repository.MemberRepository;
import com.example.ecommerce.request.LoginRequest;
import com.example.ecommerce.response.LoginResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LoginService {

    private final MemberRepository memberRepository;

    public LoginService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public LoginResponse loginResponse(LoginRequest loginRequest) {
        Optional<Member> username = memberRepository.findByUsername(loginRequest.getUsername());
        Optional<Member> password = memberRepository.findByPassword(loginRequest.getPassword());
        if (username.isEmpty() || password.isEmpty()) {
            throw new RuntimeException("Kullanıcı yok");
        } else {
            Member member1 = new Member();
            member1.setId(username.get().getId());
            LoginResponse loginResponse = new LoginResponse();
            long id = member1.getId();
            loginResponse.setId(String.valueOf(id));
            return loginResponse;
        }
    }
}
