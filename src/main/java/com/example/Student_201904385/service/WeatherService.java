package com.example.Student_201904385.service;

import com.example.Student_201904385.dto.WeatherRequestDto;
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

    public WeatherRequestDto getCurrentWeather(String city) {          // String → WeatherRequestDto

        var weatherReq = new WeatherCityReq();      // WeatherCityReq()로 변경
        weatherReq.setQuery(city);        // 도시 이름 전달

        var weatherRes = weatherClient.getCurrentWeather(weatherReq);

        var weather = weatherRes.getWeather().stream().findFirst().get();
        var result = new WeatherRequestDto();
        result.setId(weather.getId());
        result.setMain(weather.getMain());
        result.setDescription(weather.getDescription());
        result.setIcon(weather.getIcon());

        return result;
    }

    public  WeatherRequestDto getCurrentWeatherWithGeo(Double lat, Double lon) {        // String -> WeatherRequestDto
        var weatherReq = new WeatherGeoReq();       // 지리 정보로 받아오기
        weatherReq.setLat(lat);
        weatherReq.setLon(lon);

        var weatherRes = weatherClient.getCurrentWeather(weatherReq);

        var weather = weatherRes.getWeather().stream().findFirst().get();
        var result = new WeatherRequestDto();
        result.setId(weather.getId());
        result.setMain(weather.getMain());
        result.setDescription(weather.getDescription());
        result.setIcon(weather.getIcon());

        return result;
    }

}
