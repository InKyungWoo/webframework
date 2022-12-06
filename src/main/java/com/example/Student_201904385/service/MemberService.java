package com.example.Student_201904385.service;

import com.example.Student_201904385.domain.Member;
import com.example.Student_201904385.dto.PostUserRequest;
import com.example.Student_201904385.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    private ModelMapper modelMapper;
    private final MemberRepository memberRepository;

    public void save(PostUserRequest user) {

        Member member = modelMapper.map(user, Member.class);
        Optional<Member> result = Optional.ofNullable(memberRepository.findByUserIdAndEmailAndName(user.getUserId(), user.getEmail(), user.getName()));
        // optional : 없을 수도 있음, 찾아서 있으면 수정 (아이디, 메일, 이름으로 검색)

        if (result.isEmpty() == false) {        // 있으면 업데이트
            member.setId(result.get().getId());
        }
        memberRepository.save(member);          // 없으면 save(생성)
    }

    public PostUserRequest findById(String userId) {
        Member member = memberRepository.findByUserId(userId);
        PostUserRequest user = modelMapper.map(member, PostUserRequest.class);
        return user;
    }

    public void deleteById(String userId) {
        memberRepository.deleteByUserId(userId);
    }
}
