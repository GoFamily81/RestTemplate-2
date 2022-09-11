package com.example.resttemplate2.service.impl;

import com.example.resttemplate2.dto.ShortWeather;
import com.example.resttemplate2.dto.WeatherDto;
import com.example.resttemplate2.mapper.ShortWeatherMapper;
import com.example.resttemplate2.service.WeatherService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {
    RestTemplate restTemplate = new RestTemplate();
    WeatherDto weatherDto = new WeatherDto();
    String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&appid=4316cf1ed88b05f7f4795b2c1c0f40a6";

    @Override
    public WeatherDto getWeatherDto() {
        weatherDto = restTemplate.getForObject(url, WeatherDto.class);
        return weatherDto;
    }

    public ShortWeather getShortWeather() {
        weatherDto = restTemplate.getForObject(url, WeatherDto.class);
        return ShortWeatherMapper.getShortWeather(weatherDto, new ShortWeather());
    }
}
