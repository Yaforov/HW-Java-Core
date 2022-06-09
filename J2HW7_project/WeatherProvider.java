package J2HW7_project;
/**
 * Java Core.  Homework 7
 * @author Yaforov Roman
 * @version Date: 08.06.2022 г.
 */

import J2HW7_project.enums.Periods;
import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods period) throws IOException;
}
