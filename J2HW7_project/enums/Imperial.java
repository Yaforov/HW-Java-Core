package J2HW7_project.enums;
/**
 * Java Core.  Homework 7
 * @author Yaforov Roman
 * @version Date: 08.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Imperial {
    @Override
    public String toString(){
        return "Imperial{"+
                "Unit="+unit+'\''+
                ", UnitType="+unitType+
                ", Value="+value+
                '}';
    }

    @JsonProperty(value = "Unit")
    private String unit;
    @JsonProperty(value = "UnitType")
    private float unitType;
    @JsonProperty(value = "Value")
    private float value;

}