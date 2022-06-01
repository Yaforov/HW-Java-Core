package J2HW5_File;
/**
 * Java Core.  Homework 5
 * @author Yaforov Roman
 * @version Date: 01.06.2022 г.
 */

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("new.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_1.csv");
    }

}
