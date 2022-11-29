package com.example.Student_201904385.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherCityReq extends WeatherReq{
    private String query = "";          // query는 여기에 재생성

    public MultiValueMap<String, String> toMultiValueMap() {
        var map = new LinkedMultiValueMap<String, String>();

        map.add("q", query);
        map.add("appid", appId);        // // WeatherReq의 appid 가져옴, protected라 갖다 쓸 수 있음 (private이면 X)

        return map;

    }
}
