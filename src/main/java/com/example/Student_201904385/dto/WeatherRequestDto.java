package com.example.Student_201904385.dto;

import com.example.Student_201904385.weather.dto.WeatherDtoRes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRequestDto {
    private String base;
    private int visibility;
    private int dt;
    private int timeZone;
    private int id;
    private String name;
    private int cod;

    private WeatherDtoRes.DtoResCoord coord;
    private List<WeatherDtoRes.DtoResWeather> weather;
    private WeatherDtoRes.DtoResMain main;
    private WeatherDtoRes.DtoResWind wind;
    private WeatherDtoRes.DtoResClouds clouds;
    private WeatherDtoRes.DtoResSys sys;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Coord {
        private double lon;
        private double lat;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Weather {
        private String id;
        private String main;
        private String description;
        private String icon;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Main {
        private double temp;
        private double feelsLike;
        private double tempMin;
        private double tempMax;
        private int pressure;
        private int humidity;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Wind {
        private double speed;
        private int deg;
        private double gust;
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Clouds {
        private int all;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Sys {
        private String country;
        private int sunrise;
        private int sunset;
    }


}
