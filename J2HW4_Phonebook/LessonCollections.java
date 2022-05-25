package J2HW4_Phonebook;
/**
 * Java Core.  Homework 4
 * @author Yaforov Roman
 * @version Date: 25.05.2022 г.
 */

import java.util.*;

public class LessonCollections {
    public static void main(String[] args) {
        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово..
        String[] words = {
                "тополь",
                "тополь",
                "пихта",
                "вишня",
                "клён",
                "груша",
                "пихта",
                "груша",
                "груша",
                "сосна",
                "тополь",
                "ель",
                "сосна",
                "дуб",
                "клён",
                "вишня",
                "тополь",
                "топль",
                "вишня",
                "пихта",
                "вишня"
        };

        System.out.println("Слово : количество таких слов в списке:");
        countUnique(words);

        //2.Phonebook

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ржевский", "+7 999 123-45-67");
        phonebook.add("Ржевский", "+7 999 123-45-68");
        phonebook.add("Чепаев", "+7 999 123-45-69");
        phonebook.add("Чепаев", "+7 999 123-45-70");
        phonebook.add("Чепаев", "+7 999 123-45-71");
        phonebook.add("Незнайкин", "+7 666 123-45-71");
        phonebook.add("Незнайкин", "+7 666 123-45-72");
        phonebook.add("Незнайкин", "+7 666 123-45-73");
        phonebook.add("Нагиев", "+7 888 123-45-74");

        System.out.println("\n\nТелефонный справочник.");
        System.out.println("Фамилия : номер(а):");
        phonebook.show();
        System.out.println("===============================");
        System.out.println("Чепаев:" + phonebook.get("Чепаев"));
    }

    private static void countUnique(String[] words) {
        Map<String, Integer> numberOfWords = new LinkedHashMap<>();
        for (String word : words) {
            countWord(numberOfWords, word);
        }
        for (String word: numberOfWords.keySet()) {
            System.out.println(word + " : " + numberOfWords.get(word) + " штук(а/и)");
        }
    }

    private static void countWord(Map<String, Integer> numberOfWords, String word) {
        if (numberOfWords.containsKey(word)) {
            numberOfWords.put(word, numberOfWords.get(word) + 1);
        }
        else {
            numberOfWords.put(word,1);
        }
    }
}