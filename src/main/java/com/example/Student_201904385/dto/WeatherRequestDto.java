package com.example.Student_201904385.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRequestDto {
    private int id;
    private String main;
    private String description;
    private String icon;
}
