package eu.jegorov.external.service.open_weather_map.dto;

import lombok.Data;

@Data
public class WeatherResponse {

  private Clouds clouds;
  private Main main;
  private Sys sys;
  private Wind wind;
  private String name;
  private Integer timezone;
  private Integer visibility;
}
