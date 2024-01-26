package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        List<Integer> dishesList = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishesList.add(i);
        }
        int index=everyDishNumberToEat-1;
        while (dishesList.size()>everyDishNumberToEat){
           list.add(dishesList.get(index));
            for (int i = 0; i < index; i++) {
                if(i==index){

                }else{
                    dishesList.add(dishesList.get(0));
                }
                dishesList.remove(0);
            }
            dishesList.remove(0);
        }
        if (dishesList.size()==everyDishNumberToEat){
            for (int i = 0; i < everyDishNumberToEat; i++) {
                if (everyDishNumberToEat%dishesList.size()==0){
                    list.add(dishesList.get(dishesList.size()-1));
                    dishesList.remove(dishesList.size()-1);
                }else {
                    list.add(dishesList.get(everyDishNumberToEat%dishesList.size()-1));
                    dishesList.remove(everyDishNumberToEat%dishesList.size()-1);
                }
//
            }
        }
        return list;
    }
}
