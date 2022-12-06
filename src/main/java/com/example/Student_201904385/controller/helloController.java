package com.example.Student_201904385.controller;

import com.example.Student_201904385.dto.HelloRequest;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class helloController {
    @ApiOperation(value = "Hello", notes = "hello + name + level")
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "") String name,
                        @RequestParam(required = false, defaultValue = "1") int level) {
        return "hello " + name + "(" + level + ")";
    }
    @ApiOperation(value = "Path-hello", notes = "hello + {name}")
    @GetMapping("/path-hello/{name}")  //앞은 고정 {}은 변경
    public String pathHello(@PathVariable String name) {
        return "hello " + name;
    }
    @ApiOperation(value = "Map-hello", notes = "key : name value : Inkyung")
    @GetMapping("/map-hello")
    public String mapHello(@RequestParam Map<String, String> queryParam) {

        queryParam.entrySet().forEach(stringStringEntry -> {
            System.out.println("key : " + stringStringEntry.getKey() +
                    " value : " + stringStringEntry.getValue());
        });
        return "";
    }
    @ApiOperation(value = "Object-hello", notes = "HelloRequest(name=Inkyung, level=3, address=hufs)")
    @GetMapping("object-hello")
    public String objectHello(HelloRequest requestParam) {
        System.out.println(requestParam.toString());

        return requestParam.toString();
    }
    @ApiOperation(value = "그냥 Hi", notes = "hi")
    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
