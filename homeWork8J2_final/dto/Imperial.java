package homeWork8J2_final.dto;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
class Imperial {
    @Override
    public String toString() {
        return "Imperial{" +
                "Unit='" + Unit + '\'' +
                ", UnitType=" + UnitType +
                ", Value=" + Value +
                '}';
    }

    @JsonProperty(value = "Unit")
    private String Unit;

    @JsonIgnore
    private String unit;

    @JsonProperty(value = "UnitType")
    private float UnitType;

    @JsonIgnore
    private float unitType;

    @JsonProperty(value = "Value")
    private float Value;

    @JsonIgnore
    private float value;
}
