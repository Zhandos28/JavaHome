package com.lesson1;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Email {

    public static String email(String str) {
        String[] list = str.split(";");
        String string = "";
        for(int i = 0; i < list.length; i++) {
            string += list[i].substring(list[i].indexOf("@")+1, list[i].indexOf(".")) + "\n";
        }
        return string;
    }

    public static ArrayList<String> abc(String... str) {
        ArrayList<String> list = new ArrayList<>();
        for(String s : str) {
            if(!list.contains(s)){
                list.add(s);
            }
        }
        Collections.sort(list);
        return list;    
    }

    public static boolean ravensto(StringBuilder s1, StringBuilder s2) {
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String s = email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
        System.out.println(s);
        StringBuilder s1 = new StringBuilder("new");
        StringBuilder s2 = new StringBuilder("new");
        System.out.println(ravensto(s1,s2));
    }

}
