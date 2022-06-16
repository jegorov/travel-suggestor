package eu.jegorov.web;

import eu.jegorov.external.service.open_weather_map.dto.WeatherResponse;
import eu.jegorov.external.service.open_weather_map.service.OpenWeatherMapWeatherService;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/travel")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TravelController {

    @ConfigProperty(name = "external.open_weather_api_key")
    String key;

    @Inject
    @RestClient
    OpenWeatherMapWeatherService openWeatherMapWeatherService;

    public TravelController() {
    }

    @GET
    @Path("/weather/city/{city}")
    public WeatherResponse getByCity(@PathParam("city") String city) {
        WeatherResponse weatherResponse = openWeatherMapWeatherService.byCity(city,key);

        return weatherResponse;
    }

    @GET
    @Path("/weather/zip/{zip}")
    public WeatherResponse getByZip(@PathParam("zip") String zip) {
        return openWeatherMapWeatherService.byZip(zip,key);
    }
}
