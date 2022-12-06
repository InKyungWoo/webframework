package com.example.Student_201904385.controller;

import com.example.Student_201904385.domain.Member;
import com.example.Student_201904385.dto.PostUserRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Student_201904385.service.MemberService;

import java.util.Map;
import java.util.Optional;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    MemberService memberService;
    @ApiOperation(value = "사용자 정보 POST", notes = "swagger 테스트")         // 기능에 설명 달아주기!
    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {
        System.out.println("Test POST");
        log.info("Test POST");
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key : " + stringObjectEntry.getKey()
                    + "value : " + stringObjectEntry.getValue());
        });
    }

    @ApiOperation(value = "사용자 정보 등록", notes = "DB 테스트")
    //@PostMapping("/post-object")
    @PostMapping("/register")
    public void postObject(@RequestBody PostUserRequest requestData) {
        System.out.println("Test POST OBJECT");
        System.out.println(requestData.toString());

        memberService.save(requestData);
    }

    @ApiOperation(value = "사용자 정보 PUT", notes = "swagger 테스트")
    @PutMapping("/put")
    public void put(@RequestBody Map<String, Object> requestData) {
        System.out.println("Test PUT");
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key : " + stringObjectEntry.getKey() +
                    " value : " + stringObjectEntry.getValue());
        });
    }
    @ApiOperation(value = "사용자 정보 수정", notes = "DB 테스트")
    //@PutMapping("/put-object")
    @PutMapping("/update")
    public void putObject(@RequestBody PostUserRequest requestData) {
        System.out.println("Test PUT OBJECT");
        System.out.println(requestData.toString());

        memberService.save(requestData);
    }
    @ApiOperation(value = "사용자 정보 PUT-OBJECT-ENTITY", notes = "swagger 테스트")
    @PutMapping("put-object-entity")
    public ResponseEntity<PostUserRequest> putObjectEntity(
            @RequestBody PostUserRequest requestData) {

        return  ResponseEntity.status(HttpStatus.CREATED).body(requestData);
    }
    @ApiOperation(value = "사용자 정보 GET", notes = "DB 테스트")
    //@GetMapping("/get")
    @GetMapping("/{user_id}")
    public PostUserRequest getUser(@PathVariable String user_id) {
        //PostUserRequest user = new PostUserRequest();
        //user.setName("tester1234");

        return memberService.findById(user_id);
    }

    @ApiOperation(value = "사용자 정보 삭제", notes = "DB 테스트")
    //@DeleteMapping("/delete/{id}")
    @DeleteMapping("/{user_id}")
    public void delete(@PathVariable String user_id) {
        //System.out.println("Test DELETE");
        //System.out.println(id);
        //System.out.println(email);

        memberService.deleteById(user_id);

    }

}
