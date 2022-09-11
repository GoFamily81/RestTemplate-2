package com.example.resttemplate2.dto;

import com.example.resttemplate2.rest.*;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private MainW main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Integer dt;
    private Sys sys;
    private Integer id;
    private String name;
    private Integer cod;
}
