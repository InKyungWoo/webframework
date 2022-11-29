package com.example.Student_201904385.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDtoRes {

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResCoord {
        private double lon;
        private double lat;
    }

    private List<DtoResWeather> weather;
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DtoResWeather {
        private int id;
        private String main;
        private String description;
        private String icon;
    }

    private String base;

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

    private int visibility;

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

    private int dt;

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
    private int timezone;
    private int id;
    private String name;
    private int cod;

}
