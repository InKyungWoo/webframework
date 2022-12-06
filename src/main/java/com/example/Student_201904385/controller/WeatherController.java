package com.example.Student_201904385.controller;

import com.example.Student_201904385.dto.WeatherRequestDto;
import com.example.Student_201904385.service.WeatherService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;        // 서비스 연결
    @ApiOperation(value = "도시 이름으로 날씨 정보 가져오기")
    @GetMapping("/city/{name}")             // 도시 이름으로 getWeather
    public WeatherRequestDto getCurrentWeather(@PathVariable String name) {         // String -> WeatherRequestDto

        return weatherService.getCurrentWeather(name);
    }
    @ApiOperation(value = "지리 정보로 날씨 정보 가져오기")
    @GetMapping("/geo")
    public WeatherRequestDto getCurrentWeather(@RequestParam Double lat, @RequestParam Double lon) {    // String -> WeatherRequestDto
        return weatherService.getCurrentWeatherWithGeo(lat, lon);
    }
}
