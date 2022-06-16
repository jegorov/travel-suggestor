package eu.jegorov.external.service.open_weather_map.service;

import eu.jegorov.external.service.open_weather_map.dto.WeatherResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/weather")
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
public interface OpenWeatherMapWeatherService {

  @GET
  WeatherResponse byCity(@QueryParam("q") String city, @QueryParam("appid") String key);

  @GET
  WeatherResponse byZip(@QueryParam("zip") String zip, @QueryParam("appid") String key);
}
