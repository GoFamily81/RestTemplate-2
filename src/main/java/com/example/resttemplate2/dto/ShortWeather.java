package com.example.resttemplate2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShortWeather {
    private String country;
    private String city;
    private Double temp;
    private Double speed;
}
