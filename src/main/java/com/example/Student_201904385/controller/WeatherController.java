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

    @GetMapping("/current/{city}")
    public String getCurrentWeather(@PathVariable String city) {
        return weatherService.getCurrentWeather(city);
    }
}
