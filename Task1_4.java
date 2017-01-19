package com.epam;


public class Task1_4 {
    public static void main(String[] args) {

        double x = 0, y = 0;

        if (args.length == 2) {

            try {
                x = Double.parseDouble(args[0]);
                y = Double.parseDouble(args[1]);

            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 2 arguments, they must be coordinates (x,y).");
                return;

            }
            if (y > 0 && x <= 2 && x >= -2)
            {
                System.out.println(true);

            } else {
                if (y <= 0 && y >= -3 && x <= 4 && x >= -4)
                {
                    if (x == 0 && y == -1) {

                            System.out.println(false);
                            return;
                    }
                    System.out.println(true);

                } else {
                    System.out.println(false);
                }
            }

        } else {

            System.out.println("Enter 2 arguments, they must be coordinates (x,y).");
        }
    }
}
