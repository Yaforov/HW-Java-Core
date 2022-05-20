package J2HW3_Fruit;
/**
 * Java Core.  Homework 3
 * @author Yaforov Roman
 * @version Date: 20.05.2022 г.
 */

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public float getWeight(){
        float weight = 0.0f;
        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }

    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void pourTo(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount){
        for(int i=0;i<amount;i++){
            box.add(fruit);
        }
    }
}