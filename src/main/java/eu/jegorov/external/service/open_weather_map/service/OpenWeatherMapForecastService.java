package eu.jegorov.external.service.open_weather_map.service;

import eu.jegorov.external.service.open_weather_map.dto.WeatherResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/forecast")
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
public interface OpenWeatherMapForecastService {

    @GET
    @Path("hourly")
    WeatherResponse hourlyByCity(@QueryParam("q") String city, @QueryParam("appid") String key);

    @GET
    @Path("daily")
    WeatherResponse dailyByCity(@QueryParam("q") String city, @QueryParam("appid") String key);

    @GET
    @Path("hourly")
    WeatherResponse hourlyByZip(@QueryParam("zip") String zip, @QueryParam("appid") String key);

    @GET
    @Path("daily")
    WeatherResponse DailyByZip(@QueryParam("zip") String zip, @QueryParam("appid") String key);
}
