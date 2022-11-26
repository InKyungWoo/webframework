package com.example.Student_201904385.controller;

import com.example.Student_201904385.dto.PostUserRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
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

    @PostMapping("/post-object")
    public void postObject(@RequestBody PostUserRequest requestData) {
        System.out.println("Test POST OBJECT");
        System.out.println(requestData.toString());
    }

    @PutMapping("/put")
    public void put(@RequestBody Map<String, Object> requestData) {
        System.out.println("Test PUT");
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key : " + stringObjectEntry.getKey() +
                    "value : " + stringObjectEntry.getValue());
        });
    }

    @PutMapping("/put-object")
    public void putObject(@RequestBody PostUserRequest requestData) {
        System.out.println("Test PUT OBJECT");
        System.out.println(requestData.toString());
    }

    @PutMapping("put-object-entity")
    public ResponseEntity<PostUserRequest> putObjectEntity(
            @RequestBody PostUserRequest requestData) {

        return  ResponseEntity.status(HttpStatus.CREATED).body(requestData);
    }

    @GetMapping("/get")
    public PostUserRequest getUser() {
        PostUserRequest user = new PostUserRequest();
        user.setName("tester1234");

        return user;
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id, @RequestParam String email) {
        System.out.println("Test DELETE");
        System.out.println(id);
        System.out.println(email);
    }
}
