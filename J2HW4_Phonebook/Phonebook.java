package J2HW4_Phonebook;
/**
 * Java Core.  Homework 4
 * @author Yaforov Roman
 * @version Date: 25.05.2022 г.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> map;

    public Phonebook() {
        map = new HashMap<>();
    }

    public void add(String lastName, String number) {
        if (map.containsKey(lastName)) {
            List<String> numbers = map.get(lastName);
            numbers.add(number);
        }
        else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            map.put(lastName, numbers);
        }
    }

    public void show() {
        map.keySet().stream().sorted().forEach(lastName -> {
            System.out.print(lastName + " : ");
            System.out.println(String.join(" , ", this.get(lastName)) + ".");
        });
    }

    public List<String> get(String lastName) {
        return  map.get(lastName);
    }
}