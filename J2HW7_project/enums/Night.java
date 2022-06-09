package J2HW7_project.enums;
/**
 * Java Core.  Homework 7
 * @author Yaforov Roman
 * @version Date: 08.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Night {
    @Override
    public String toString(){
        return "Night{"+
                "Icon="+icon+
                ", IconPhrase="+iconPhrase+
                ", HasPrecipitation="+hasPrecipitation+
                ", PrecipitationType="+precipitationType+
                ", PrecipitationIntensity="+precipitationIntensity+
                '}';
    }

    @JsonProperty(value = "Icon")
    private String icon;
    @JsonProperty(value = "IconPhrase")
    private String iconPhrase;
    @JsonProperty(value = "HasPrecipitation")
    private boolean hasPrecipitation;
    @JsonProperty(value = "PrecipitationType")
    private String precipitationType;
    @JsonProperty(value = "PrecipitationIntensity")
    private String precipitationIntensity;


}
