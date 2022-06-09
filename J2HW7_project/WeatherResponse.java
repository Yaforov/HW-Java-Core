package J2HW7_project;
/**
 * Java Core.  Homework 7
 * @author Yaforov Roman
 * @version Date: 08.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import J2HW7_project.enums.Day;
import J2HW7_project.enums.Night;
import J2HW7_project.enums.Temperature;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @Override
    public String toString(){
        return "WeatherResponse{" +
                "WeatherText='"+weatherText+'\''+
                ", Date='"+date+'\''+
                ", Temperature='"+temperature+
                ", Day='"+day+
                ", Night='"+night+
                '}';

    }
    @JsonProperty(value = "Date")
    private String date;
    @JsonProperty(value = "WeatherText")
    private String weatherText;
    @JsonProperty(value = "Temperature")
    private Temperature temperature;
    @JsonProperty(value = "Day")
    private Day day;
    @JsonProperty(value = "Night")
    private Night night;
}
