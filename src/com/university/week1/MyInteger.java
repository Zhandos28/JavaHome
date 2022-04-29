package com.university.week1;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return ((value&1) == 0);
    }

    public boolean isOdd(){
        return ((value&1) != 0);
    }

    public boolean isPrime(){
        if (value <= 1)
            return false;
        if (value <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (value % 2 == 0 || value % 3 == 0)
            return false;

        for (int i = 5; i * i <= value; i = i + 6)
            if (value % i == 0 || value % (i + 2) == 0)
                return false;

        return true;
    }

    public static boolean isEven(int n){
        return ((n&2) == 0);
    }

    public static boolean isOdd(int n){
        return ((n&1) != 0);
    }

    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static boolean isEven(MyInteger n){
        return ((n.getValue()&2) == 0);
    }

    public static boolean isOdd(MyInteger n){
        return ((n.getValue()&1) != 0);
    }

    public static boolean isPrime(MyInteger n){
        if (n.getValue() <= 1)
            return false;
        if (n.getValue()  <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n.getValue()  % 2 == 0 || n.getValue()  % 3 == 0)
            return false;

        for (int i = 5; i * i <= n.getValue() ; i = i + 6)
            if (n.getValue()  % i == 0 || n.getValue()  % (i + 2) == 0)
                return false;

        return true;
    }

    public boolean equals(int n){
        return value == n;
    }

    public boolean equals(MyInteger n){
        return value == n.getValue();
    }
    public int parseInt(char[] character){
        int sum = 0;
        for(char i: character){
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public int parseInt(String str){
        return Integer.valueOf(str);
    }
}

class Main2{
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(11);
        System.out.println(myInt.isOdd(11));
        System.out.println(myInt.isEven(11));
        System.out.println(myInt.isPrime(11));

    }
}
