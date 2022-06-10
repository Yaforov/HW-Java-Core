package homeWork8J2_final.dto;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Night {
    @Override
    public String toString() {
        return "Night{" +
                "Icon=" + icon +
                ", IconPhrase='" + iconPhrase + '\'' +
                ", HasPrecipitation=" + hasPrecipitation +
                ", PrecipitationType='" + precipitationType + '\'' +
                ", PrecipitationIntensity='" + precipitationIntensity + '\'' +
                '}';
    }

    @JsonProperty(value = "Icon")
    private float icon;

    @JsonProperty(value = "IconPhrase")
    private String iconPhrase;

    @JsonProperty(value = "HasPrecipitation")
    private boolean hasPrecipitation;

    @JsonProperty(value = "PrecipitationType")
    private String precipitationType;

    @JsonProperty(value = "PrecipitationIntensity")
    private String precipitationIntensity;
}
