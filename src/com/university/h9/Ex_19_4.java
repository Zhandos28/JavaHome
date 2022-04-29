package com.university.h9;

public class Ex_19_4 {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (key.compareTo(list[i]) == 0)
                return i;
        }
        return -1;
    }
}
