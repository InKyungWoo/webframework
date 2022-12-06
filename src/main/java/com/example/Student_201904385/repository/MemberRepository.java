package com.example.Student_201904385.repository;

import com.example.Student_201904385.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByUserId(String userId);
    Member findByUserIdAndEmailAndName(String userId, String email, String name);
    // 아이디, 메일, 이름으로 조회 -> 연결됨, Camel Case 쓸 것!
    Long deleteByUserId(String userId);
}
