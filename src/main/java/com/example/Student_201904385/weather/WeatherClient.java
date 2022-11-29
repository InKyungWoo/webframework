package com.example.Student_201904385.weather;

import com.example.Student_201904385.weather.dto.WeatherReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Component
@PropertySource("classpath:application-api-key.properties")
public class WeatherClient {

    @Value("${openweather.client.apikey}")
    private String weatherClientApiKey;

    @Value("${openweather.url.weather}")
    private String weatherUrlWeather;

    // UriComponentsBuilder: url 만들어주는 기능
    public String getCurrentWeather(WeatherReq weatherReq) {
        weatherReq.setAppId(weatherClientApiKey);
        var uri = UriComponentsBuilder.fromUriString(weatherUrlWeather)
                .queryParams(weatherReq.toMultiValueMap())          // {? 쿼리 & 쿼리}
                .build()
                .encode()
                .toUri();


        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        var httpEntity = new HttpEntity<>(headers);

        var responseType = new ParameterizedTypeReference<String>(){};

        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,  //메소드
                httpEntity,      //헤더
                responseType
        );

        return responseEntity.getBody();    // 응답 받으면 바디부분 get
    }
}
