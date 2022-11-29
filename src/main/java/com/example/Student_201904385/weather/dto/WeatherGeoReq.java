package com.example.Student_201904385.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherGeoReq extends WeatherReq{
    private Double lat;         // "D"ouble 앞글자 대문자!!!
    private Double lon;

    public MultiValueMap<String, String > toMultiValueMap() {
        var map = new LinkedMultiValueMap<String, String>();

        map.add("lat", lat.toString());
        map.add("lon", lon.toString());
        map.add("appid", appId);

        return map;

    }
}