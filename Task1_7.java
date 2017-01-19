package com.epam;


public class Task1_7 {

    public static void main(String[] args) {

        double a, b, h, function;

        if (args.length == 3) {

            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                h = Double.parseDouble(args[2]);

            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 3 arguments, they must be double numbers a, b, h. Coordinates [a,b] with step h.");
                return;
            }

            if (a < b)
            {
                double x = a;
                System.out.println("x F(x)");
                do {
                    function = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
                    System.out.println(x + " " + function);
                    x += h;
                } while (x <= b);


                if (x - h != b){
                    function = Math.pow(Math.sin(b), 2) - Math.cos(2 * b);
                    System.out.println(b + " " + function);
                }
            } else {
                System.out.println("Enter 3 arguments, they must be double numbers. Coordinates [a,b] with step h. \nCoordinate a must be less than b!");
            }

        } else {

            System.out.println("Enter 3 arguments, they must be double numbers a, b, h. Coordinates [a,b] with step h.");
        }
    }

}
