package com.example.ecommerce.response;

public class MemberCreateResponse {

    private final Long memberId;

    private MemberCreateResponse(Long memberId) {
        this.memberId = memberId;
    }

    public static com.example.ecommerce.response.MemberCreateResponse create(Long memberId) {
        return new com.example.ecommerce.response.MemberCreateResponse(memberId);
    }

    public Long getMemberId() {
        return memberId;
    }
}
