package com.example.ecommerce.repository;

import com.example.ecommerce.domain.Member;
import com.example.ecommerce.repository.base.BaseJpaRepository;

import java.util.Optional;

public interface MemberRepository extends BaseJpaRepository<Member> {

    Optional<Member> findByUsername(String username);
    Optional<Member> findByPassword(String password);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
