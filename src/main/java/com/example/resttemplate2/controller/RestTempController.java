package com.example.resttemplate2.controller;

import com.example.resttemplate2.dto.ShortWeather;
import com.example.resttemplate2.dto.WeatherDto;
import com.example.resttemplate2.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestTempController {
    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherDto getWeatherRestTemplate() {
        return weatherService.getWeatherDto();
    }
    @GetMapping("/shortweather")
    public ShortWeather getShortWeather(){
        return weatherService.getShortWeather();
    }
}
