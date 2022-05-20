package J2HW3_Fruit;
/**
 * Java Core.  Homework 3
 * @author Yaforov Roman
 * @version Date: 20.05.2022 г.
 */

import java.util.Arrays;

class HomeWork3 {

    /**
     * 1. Написать метод, который меняет два элемента массива местами.
     * (массив может быть любого ссылочного типа);
     */
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"};
        swap(arr1, 1, 4);
        swap(arr2, 0, 2);

    /** 2. Задача с фруктами: **/

        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();
        System.out.println("Задача с фруктами:");
        orange.addFruit(new Orange(),10);
        orange1.addFruit(new Orange(),10);
        apple.addFruit(new Apple(),20);
        apple1.addFruit(new Apple(),10);
        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());
        System.out.println("Сравниваем фруты в коробках: ");
        System.out.println("Box 1 сравниваем по весу box 3: "+orange.compare(apple));
        System.out.println("Box 1 сравниваем по весу box 2: "+orange.compare(orange1));
        System.out.println("Box 3 сравниваем по весу box 4: "+apple.compare(apple1));
        System.out.println("Box 2 сравниваем по весу box 4: "+orange1.compare(apple1));
        System.out.println("перекладываем в одну коробку однотипные фрукты: ");
        orange.pourTo(orange1);
        apple.pourTo(apple1);
        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());
    }

    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Массив: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат смены слементов местами: "+Arrays.toString(arr)+"\n================================");
    }
}