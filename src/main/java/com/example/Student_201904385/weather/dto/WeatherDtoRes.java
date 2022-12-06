package com.example.Student_201904385.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDtoRes {

    private String base;                                        // 개별 info
    private int visibility;
    private int dt;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    private WeatherDtoRes.DtoResCoord coord;                    // 클래스 뭉치로 보내기
    private List<WeatherDtoRes.DtoResWeather> weather;          // weather info는 리스트
    private WeatherDtoRes.DtoResMain main;
    private WeatherDtoRes.DtoResWind wind;
    private WeatherDtoRes.DtoResClouds clouds;
    private WeatherDtoRes.DtoResSys sys;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResCoord {
        private double lon;
        private double lat;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResWeather {
        private int id;
        private String main;
        private String description;
        private String icon;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResMain {
        private double temp;
        private double feels_like;
        private double temp_min;
        private double temp_max;
        private int pressure;
        private int humidity;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResWind {
        private double speed;
        private double deg;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResClouds {
        private int all;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResSys {
        private int type;
        private int id;
        private String country;
        private int sunrise;
        private int sunset;
    }

}
