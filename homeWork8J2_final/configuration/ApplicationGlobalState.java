package homeWork8J2_final.configuration;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

public final class ApplicationGlobalState {

    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "BjJg8bbgogBpnDEQ36DwF8OBiENJjsoi";
    private final String DB_FILENAME = "application.db";

    private ApplicationGlobalState() {
    }

    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }
        return INSTANCE;
    }

    public String getDbFileName() {
        return DB_FILENAME;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }
}
