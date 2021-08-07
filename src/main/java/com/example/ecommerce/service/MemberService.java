package com.example.ecommerce.service;

import com.example.ecommerce.request.MemberCreateRequest;
import com.example.ecommerce.response.MemberCreateResponse;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public MemberCreateResponse createMember(MemberCreateRequest memberCreateRequest){
        return new MemberCreateResponse();
    }
}
