package de.example.swapContent;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(10.3);

        System.out.println(swapTheContent(list));
    }

    public static <E> ArrayList<E> swapTheContent(ArrayList<E> list){
        if(list.size()== 2){
        list.addFirst(list.getLast());
        list.removeLast();
        }
        return list;
    }
}