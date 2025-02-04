package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalInfoResponse(@JsonPropertyDescription("This is the city name") String cityName,
                                     @JsonPropertyDescription("City population") Long population,
                                     @JsonPropertyDescription("Region") String region,
                                     @JsonPropertyDescription() String language,
                                     @JsonPropertyDescription() String currency) {
}
