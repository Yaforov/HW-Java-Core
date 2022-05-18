package J2HW2;
/**
 * Java Core.  Homework 2
 * @author Yaforov Roman
 * @version Date: 18.05.2022 г.
 */

public class SumArray {
    private static final int ARRAY_SISE = 4;
    private static final String WRONG_SIZE_ARRAY = "Неправильный размер массива!\nДолжен быть размер: 4x4.";
    private static final String WRONG_DATA_ARRAY = "Неправильный тип данных.";
    private static final String RESULT_CAPTION = "Сумма эелементов:";

    public static void main(String[] args) {
        String[][] validArray = new String[][]
                {{"10", "2", "3", "4"},
                        {"1", "1", "2", "5"},
                        {"2", "2", "2", "2"},
                        {"1", "0", "2", "10"}};
        String[][] errorSizeArray = new String[][]
                {{"6", "11", "1", "8"},
                        {"5", "5", "5", "5"},
                        {"8", "7", "6", "5"}};
        String[][] errorDataArray = new String[][]
                {{"12", "15", "1", "2"},
                        {"8", "a", "5", "3"},
                        {"2", "с", "8", "5"},
                        {"9", "2", "@", "2"}};

        try {
            System.out.println(sum(validArray));
            System.out.println(sum(errorSizeArray));
        } catch (MyArrayExceptions myArrayExceptions) {
            myArrayExceptions.printStackTrace();
        }
        try {
            System.out.println(sum(errorDataArray));
        } catch (MyArrayExceptions myArrayExceptions) {
            myArrayExceptions.printStackTrace();
        }
    }

    private static String sum(String[][] arrn) throws MyArrayExceptions {
        checkSizeArray(arrn); //проверка размерности
        checkIntsArray(arrn); // проверка перевода в int
        return RESULT_CAPTION + "\n" + rez(arrn);
    }
// rez - суммирование элементов массива
    private static int rez(String[][] arrn) {
        int result = 0;
        for (String[] i : arrn) {
            for (String j : i) {
                result += Integer.parseInt(j);
            }
        }
        return result;
    }

    private static void checkIntsArray(String[][] arrn) throws MyArrayDataException {
        int i;
        int j;
        for (i = 0; i < arrn.length; i++) {
            for (j = 0; j < arrn[i].length; j++) {
                try {
                    Integer.parseInt(arrn[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(WRONG_DATA_ARRAY +
                            "\n В ряду: " + (1 + i) + ", Строке: " + (1 + j));
                }
            }
        }
    }

    private static void checkSizeArray(String[][] arrn) throws MyArraySizeException {
        if (arrn.length != ARRAY_SISE) {
            throw new MyArraySizeException(WRONG_SIZE_ARRAY);
        }
        for (String[] strings : arrn) {
            if (strings.length != ARRAY_SISE) {
                throw new MyArraySizeException(WRONG_SIZE_ARRAY);
            }
        }
    }
}