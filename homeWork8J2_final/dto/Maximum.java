package homeWork8J2_final.dto;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Maximum {
    @Override
    public String toString() {
        return "Maximum{" +
                "Unit='" + unit + '\'' +
                ", UnitType=" + unitType +
                ", Value=" + value +
                '}';
    }

    @JsonProperty(value = "Unit")
    private String unit;

    @JsonProperty(value = "UnitType")
    private float unitType;

    @JsonProperty(value = "Value")
    private float value;
}
