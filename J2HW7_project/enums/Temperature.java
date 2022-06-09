package J2HW7_project.enums;
/**
 * Java Core.  Homework 7
 * @author Yaforov Roman
 * @version Date: 08.06.2022 г.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Temperature {
    @Override
    public String toString(){
        return "Temperature{"+
                "Metric="+metric+
                ", Minimum="+minimum+
                ", Maximum="+maximum+
                ", Imperial="+imperial+
                '}';
    }

    @JsonProperty(value = "Metric")
    private Metric metric;
    @JsonProperty(value = "Minimum")
    private Minimum minimum;
    @JsonProperty(value = "Maximum")
    private Maximum maximum;
    @JsonProperty(value = "Imperial")
    private Imperial imperial;
}
