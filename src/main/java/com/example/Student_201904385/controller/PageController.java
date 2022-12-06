package com.example.Student_201904385.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @ApiOperation(value = "html 페이지")
    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }
}
