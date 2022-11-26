package com.example.Student_201904385.controller;

import com.example.Student_201904385.dto.PostUserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {

        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key : " + stringObjectEntry.getKey()
                    + "value : " + stringObjectEntry.getValue());
        });
    }

    @PostMapping("/post-object")
    public void postObject(@RequestBody PostUserRequest requestData) {
        System.out.println(requestData.toString());
    }


}
