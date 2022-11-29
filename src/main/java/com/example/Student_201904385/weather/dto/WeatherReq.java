package com.example.Student_201904385.weather.dto;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherReq {
    private String query = "";
    private String appId = "";

    public MultiValueMap<String, String> toMultiValueMap() {
        var map = new LinkedMultiValueMap<String, String>();

        map.add("q", query);
        map.add("appid", appId);        // 필요하면 쿼리 더 추가 가능

        return map;
    }
}
