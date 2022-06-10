package homeWork8J2_final.dto;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @Override
    public String toString() {
        return "WeatherResponse{" +
                ", WeatherText='" + weatherText + '\'' +
                ", Date='" + date + '\'' +
                ", Temperature=" + temperature +
                ", Day=" + day +
                ", Night=" + night +
                '}';
    }

    @JsonProperty(value = "WeatherText")
    private String weatherText;

    @JsonProperty(value = "Date")
    private String date;

    @JsonProperty(value = "Temperature")
    private Temperature temperature;

    @JsonProperty(value = "Day")
    private Day day;

    @JsonProperty(value = "Night")
    private Night night;
}

