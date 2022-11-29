package com.example.Student_201904385.controller;

import com.example.Student_201904385.dto.SearchRequestDto;
import com.example.Student_201904385.service.SearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;

    @GetMapping("/local")
    public SearchRequestDto searchLocal(@RequestParam String query) {       // String -> SearchRequestDto
        return searchService.searchLocal(query);
    }
}
