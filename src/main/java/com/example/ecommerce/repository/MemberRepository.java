package com.example.ecommerce.repository;

import com.example.ecommerce.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
