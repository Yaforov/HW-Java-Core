package homeWork8J2_final.repository;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

import homeWork8J2_final.entity.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws IOException, SQLException;

    void closeConnection();
}
