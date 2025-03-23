package WeatherAPI_Grp_Id.WeatherAPI_Art_Id;



import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class WeatherAggregatorController {

    private final WebClient webClient = WebClient.create();

    private static final String WEATHER_API_URL = "https://api.weatherapi.com/v1/current.json?key=efedd6045792442481a93418252203&q=Dublin";
    private static final String AIR_QUALITY_API_URL = "https://api.airvisual.com/v2/city?city=Dublin";

    @GetMapping("/weather-info")
    public Mono<Map<String, Object>> getWeatherInfo(@RequestParam String city) {
        if (city == null || city.isEmpty()) {
            return Mono.just(Map.of("error", "City is required"));
        }

        // Call both APIs asynchronously
        Mono<Map> weatherMono = webClient.get()
                .uri(WEATHER_API_URL + city)
                .retrieve()
                .bodyToMono(Map.class);

        Mono<Map> airQualityMono = webClient.get()
                .uri(AIR_QUALITY_API_URL + city + "&key=YOUR_API_KEY")
                .retrieve()
                .bodyToMono(Map.class);

        // Combine API responses
        return Mono.zip(weatherMono, airQualityMono)
                .map(tuple -> Map.of(
                        "city", city,
                        "temperature", ((Map<?, ?>) tuple.getT1().get("current")).get("temp_c") + "°C",
                        "air_quality_index", ((Map<?, ?>) ((Map<?, ?>) tuple.getT2().get("data")).get("current")).get("pollution")
                ));
    }
}
