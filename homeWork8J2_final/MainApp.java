package homeWork8J2_final;
/**
 * Java Core.  Homework 8
 * @author Yaforov Roman
 * @version Date: 10.06.2022 г.
 */

import java.io.IOException;
import java.sql.SQLException;


public class MainApp {

    public static void main(String[] args) throws SQLException, IOException {
        UserInterface userInterface = new UserInterface();
        userInterface.runApplication();
    }
}
