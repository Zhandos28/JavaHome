package com.university.h9;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_19_10 {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0)
                max = list.get(i);
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {new Integer(2), new Integer(4),
                new Integer(3)};
        ArrayList<Integer> intList =
                new ArrayList<>(Arrays.asList(intArray));

        Double[] doubleArray = {new Double(3.4), new Double(1.3),
                new Double(-22.1)};
        ArrayList<Double> doubleList =
                new ArrayList<>(Arrays.asList(doubleArray));

        Character[] charArray = {new Character('a'),
                new Character('J'), new Character('r')};
        ArrayList<Character> charList =
                new ArrayList<>(Arrays.asList(charArray));

        String[] stringArray = {"Tom", "Susan", "Kim"};
        ArrayList<String> stringList =
                new ArrayList<>(Arrays.asList(stringArray));

        System.out.println("Maximum Integer object: " +
                max(intList));
        System.out.println("Maximum Double object: " +
                max(doubleList));
        System.out.println("Maximum Character object: " +
                max(charList));
        System.out.println("Maximum String object: " +
                max(stringList));
    }
}
