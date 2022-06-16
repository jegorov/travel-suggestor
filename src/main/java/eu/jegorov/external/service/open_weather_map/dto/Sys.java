package eu.jegorov.external.service.open_weather_map.dto;

import lombok.Data;

@Data
public class Sys {

    private int type;
    private int id;
    private String country;
    private int sunrise;
    private int sunset;
}
