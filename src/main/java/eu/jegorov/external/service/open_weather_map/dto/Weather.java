package eu.jegorov.external.service.open_weather_map.dto;

import lombok.Data;

@Data
public class Weather {

    private int id;
    private String main;
    private String description;
}
