package eu.jegorov.external.service.open_weather_map.dto;

import lombok.Data;

@Data
public class Main {

    private double temp;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
}
