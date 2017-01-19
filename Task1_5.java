package com.epam;


public class Task1_5 {
    public static void main(String[] args) {

        double a = 0, b = 0, c = 0;

        if (args.length == 3) {

            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                c = Double.parseDouble(args[2]);

            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 3 arguments, they must be double numbers.");
                return;
            }

            checkAndPow(a);
            checkAndPow(b);
            checkAndPow(c);

        } else {

            System.out.println("Enter 3 arguments, they must be double numbers.");
        }
    }

    private static void checkAndPow(double x)
    {
        if (x >= 0) {

            System.out.println(x + "^2 = " + Math.pow(x,2));

        } else {

            System.out.println(x + "^4 = " + Math.pow(x,4));
        }
    }

}
