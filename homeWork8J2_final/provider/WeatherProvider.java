package homeWork8J2_final.provider;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

import homeWork8J2_final.entity.WeatherData;
import homeWork8J2_final.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
