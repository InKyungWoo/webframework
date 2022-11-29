package com.example.Student_201904385.service;

import com.example.Student_201904385.weather.dto.WeatherCityReq;
import com.example.Student_201904385.weather.WeatherClient;
import com.example.Student_201904385.weather.dto.WeatherGeoReq;
import com.example.Student_201904385.weather.dto.WeatherReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherClient weatherClient;

    public String getCurrentWeather(String city) {

        var weatherReq = new WeatherCityReq();      // WeatherCityReq()로 변경
        weatherReq.setQuery(city);        // 도시 이름 전달

        var weatherRes = weatherClient.getCurrentWeather(weatherReq);

        return weatherRes;                // response 전달
    }

    public  String getCurrentWeatherWithGeo(Double lat, Double lon) {
        var weatherReq = new WeatherGeoReq();       // 지리 정보로 받아오기
        weatherReq.setLat(lat);
        weatherReq.setLon(lon);

        var weatherRes = weatherClient.getCurrentWeather(weatherReq);

        return weatherRes;
    }

}
