package com.epam;

public class Task1_3 {

    public static void main(String[] args) {

        double a = 0, b = 0, c;
        double area, perimeter;

        if (args.length == 2) {

            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);

            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 2 arguments, they must be cathetus of right triangle.");
                return;

            }
            if (a > 0 && b > 0) {

                c = Math.sqrt(b*b + a*a);

                area = (a * b)/2;
                perimeter = a + b + c;

                System.out.println("Area of triangle is " + area);
                System.out.println("Perimeter of triangle is " + perimeter);

            } else {
                System.out.println("Enter 3 arguments, they must be cathetus of right triangle. Numbers must be positive!");
            }

        } else {

            System.out.println("Enter 3 arguments, they must be cathetus of right triangle.");
        }
    }
    
}
