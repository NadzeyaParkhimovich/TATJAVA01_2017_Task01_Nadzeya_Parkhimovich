package com.epam;

public class Task1_1 {

    public static void main(String[] args) {

        int num=0;
        int a,b;

        if (args.length == 1 && args[0].length() == 4){

            try {
                num = Integer.parseInt(args[0]);
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Enter 1 argument, it must be a four-digit number");
                return;
            }

            a = num/1000+num%1000/100;
            b = num%100/10 + num%10;

            if (a == b) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }

        }
        else {
            System.out.println("Enter 1 argument, it must be a four-digit number");
        }
    }
}
