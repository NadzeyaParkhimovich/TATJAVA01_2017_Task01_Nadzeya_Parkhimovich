package com.epam;

public class Task1_2 {

    public static void main(String[] args) {

        double a = 0, b = 0, c = 0;
        double result, intResult;

        if (args.length == 3) {

            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                c = Double.parseDouble(args[2]);

            }catch (java.lang.NumberFormatException e){
                System.out.println("Enter 3 arguments, they must be double numbers");
                return;
            }

            intResult = Math.pow(b, 2) + 4 * a * c;
            result = (b + Math.sqrt(intResult)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

            System.out.println(result);

        } else {

            System.out.println("Enter 3 arguments, they must be double numbers");
        }
    }
}
