package com.example.Student_201904385.controller;

import com.example.Student_201904385.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;        // 서비스 연결

    @GetMapping("/city/{name}")             // 도시 이름으로 getWeather
    public String getCurrentWeather(@PathVariable String name) {

        return weatherService.getCurrentWeather(name);
    }
}
