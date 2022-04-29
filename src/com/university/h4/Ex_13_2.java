package com.university.h4;

import java.util.ArrayList;

public class Ex_13_2 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.3);
        list.add(3);
        list.add(4.6);
        list.add(5);
        list.add(6.246);
        list.add(7.43);
        list.add(8);
        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}
