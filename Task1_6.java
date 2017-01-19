package com.epam;

public class Task1_6 {

    public static void main(String[] args) {

        double a, b, c, result;

        if (args.length == 3) {

            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                c = Double.parseDouble(args[2]);

            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 3 arguments, they must be double numbers.");
                return;
            }
            result = findMax(a, b, c) + findMin(a, b, c);
            System.out.println("Max + Min = " + result);

        } else {

            System.out.println("Enter 3 arguments, they must be double numbers.");
        }
    }

    private static double findMin(double a, double b, double c)
    {
        double min = a;

        if (min > b) {
            min = b;
        }
        if (min > c){
            min = c;
        }
        return min;
    }

    private static double findMax(double a,double b,double c)
    {
        double max = a;

        if (max < b) {
            max = b;
        }
        if (max < c){
            max = c;
        }
        return max;
    }

}
