package com.example.Student_201904385.controller;

import com.example.Student_201904385.dto.SearchRequestDto;
import com.example.Student_201904385.service.SearchService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

@Slf4j
@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;
    @ApiOperation(value = "naver 검색 결과")
    @GetMapping("/local")
    public SearchRequestDto searchLocal(@RequestParam String query) {       // String -> SearchRequestDto
        return searchService.searchLocal(query);
    }
}
