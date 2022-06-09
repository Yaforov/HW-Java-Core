package J2HW7_project.enums;
/**
 * Java Core.  Homework 7
 * @author Yaforov Roman
 * @version Date: 08.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Day {
    @Override
    public String toString(){
        return "Day{"+
                "Icon="+icon+
                ", IconPhrase="+iconPhrase+
                ", HasPrecipitation="+hasPrecipitation+
                '}';
    }

    @JsonProperty(value = "Icon")
    private String icon;
    @JsonProperty(value = "IconPhrase")
    private String iconPhrase;
    @JsonProperty(value = "HasPrecipitation")
    private boolean hasPrecipitation;

}