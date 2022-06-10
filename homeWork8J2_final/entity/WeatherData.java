package homeWork8J2_final.entity;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

public class WeatherData {

    private String city;
    private String localDate;
    private String dayText;
    private String nightText;
    private Double minTemperature;
    private Double maxTemperature;

    public WeatherData() {
    }

    public WeatherData(String city, String localDate, String dayText, String nightText, Double minTemperature, Double maxTemperature) {
        this.city = city;
        this.localDate = localDate;
        this.dayText = dayText;
        this.nightText = nightText;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public String getCity() {
        return city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public String getDayText() {
        return dayText;
    }

    public String getNightText() {
        return nightText;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", dayText='" + dayText + '\'' +
                ", nightText='" + nightText + '\'' +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                '}';
    }
}
