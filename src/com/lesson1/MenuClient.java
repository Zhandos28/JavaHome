package com.lesson1;

import java.util.Scanner;

public class MenuClient {
    public static void main(String[] args) {
        String[][] menu = {
                {"Exit menu."},
                {
                    "Exit menu", "Chicken hamburger - 509 kzt.", "Beef hamburger - 790 kzt.",
                        "Chicken cheeseburger - 790 kzt.", "Beef cheeseburger - 890 kzt.",
                        "Double chicken hamburger - 990 kzt.", "Double chicken cheeseburger - 1090 kzt.",
                        "Double beef hamburger - 1090 kzt.", "Double beef cheeseburger - 1190 kzt.",
                        "Mixed hamburger - 1090 kzt.", "Mixed cheeseburger - 1190 kzt."
                },
                {"Exit menu.", "Spicy hot dog - 590 kzt.", "Hot dog - 590 kzt."},
                {"Exit menu.", "French fries - 390 kzt."},
                {"Exit menu.", "Coca-cola 0.51 - 250 kzt.", "Fanta 0.51 - 250 kzt.",
                        "Sprite 0.51 - 250 kzt.", "Fuse tea 0.51 - 250 kzt.", "Bon aqua 0.51 - 250 kzt.",
                        "Raspberry compote 0.31 - 250 kzt.", "Currant compote 0.31 - 250 kzt.", "Piko pulpy 0.51 - 350 kzt."
                },
                {"Exit menu.", "Ketchup - 100 kzt.", "Cheese sauce - 100 kzt.", "Sauce BBQ - 100 kzt.",
                        "Spicy sauce - 50 kzt.", "Mustard sauce - 100 kzt."
                },
                {"Exit menu.", "Jalapeno - 100 kzt.", "Cheese - 150 kzt."},
        };
        StringBuilder check = new StringBuilder();
        int totalPrice = 0;
        String[] names = {"Exit menu", "Burgers", "Hot dogs", "French fries", "Drinks", "Sauces",
                "Additives", "Clear basket", "Check basket"};
        OUTER: while(true){
            int result;
            String[] price;
            for(int i = 0; i < names.length; i++) {
                System.out.println(i + ". " + names[i] + ".");
            }
            System.out.print("\nChoose one: ");
            Scanner scan = new Scanner(System.in);
            result = scan.nextInt();
            System.out.println("\n");
            if(result == 0){
                break OUTER;
            }
            else if(result > 0 && result < 7){
                String name = names[result];
                for(int i = 0; i < menu[result].length; i++) {
                    System.out.println(i + ". " + menu[result][i]);
                }
                System.out.print("\nChoose a " + name.substring(0,name.length()-1).toLowerCase() + ": ");
                int innerResult = scan.nextInt();
                System.out.print("\n");
                if(innerResult == 0) {
                    continue;
                }
                else if(innerResult > 0 && innerResult < menu[result].length){
                    String good = menu[result][innerResult];
                    check.append(good+"\n");
                    price = good.split(" ");
                    totalPrice += Integer.parseInt(price[price.length-2]);
                }
            }
            else if(result == 7) {
                check = new StringBuilder();
                totalPrice = 0;
            }
            else if(result == 8) {
                if(check.length() == 0){
                    System.out.print("Basket is empty.\nTotal price: 0 kzt.\n\n");
                }
                else{
                    System.out.println(check);
                    System.out.println("Total price: " + totalPrice + " kzt.\n");
                }
            }
        }
    }
}
