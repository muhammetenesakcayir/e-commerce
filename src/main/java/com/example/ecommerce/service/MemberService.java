package com.example.ecommerce.service;

import com.example.ecommerce.converter.MemberRequestConverter;
import com.example.ecommerce.repository.MemberRepository;
import com.example.ecommerce.request.MemberCreateRequest;
import com.example.ecommerce.response.MemberCreateResponse;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberRequestConverter memberRequestConverter;

    public MemberService(MemberRepository memberRepository, MemberRequestConverter memberRequestConverter) {
        this.memberRepository = memberRepository;
        this.memberRequestConverter = memberRequestConverter;
    }

    public MemberCreateResponse createMember(MemberCreateRequest memberCreateRequest) {
        boolean existEmail = memberRepository.existsByEmail(memberCreateRequest.getEmail());
        boolean existUsername = memberRepository.existsByUsername(memberCreateRequest.getUsername());

        if (existEmail || existUsername) {
            throw new RuntimeException("an error occurred while creating member");
        }

        var member = memberRequestConverter.convert(memberCreateRequest);
        var memberId = memberRepository.save(member).getId();

        return MemberCreateResponse.create(memberId);
    }
}
