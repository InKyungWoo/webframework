package com.example.Student_201904385.service;

import com.example.Student_201904385.weather.WeatherClient;
import com.example.Student_201904385.weather.dto.WeatherReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherClient weatherClient;

    public String getCurrentWeather(String city) {

        var weatherReq = new WeatherReq();
        weatherReq.setQuery(city);        // 도시 이름 전달

        var weatherRes = weatherClient.getCurrentWeather(weatherReq);

        return weatherRes;                // response 전달
    }
}
