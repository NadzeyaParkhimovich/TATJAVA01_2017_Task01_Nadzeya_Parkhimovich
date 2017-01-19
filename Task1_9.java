package com.epam;


public class Task1_9 {
    public static void main(String[] args) {

        int  k;
        String [] mas1, mas2;
        if (args.length == 3) {

            try {
                k = Integer.parseInt(args[2]);
                if (k <= 0)
                {
                    System.out.println("Enter 3 arguments:\n1 - array 1\n2 - array 2\n3 - k > 0\nYou have k <= 0!");
                    System.out.println("Example: \"1 2 3 4 5\" \"8 8 8 8\" 2");
                    return;
                }


            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 3 arguments:\n1 - array 1\n2 - array 2\n3 - k > 0");
                System.out.println("Example: \"1 2 3 4 5\" \"8 8 8 8\" 2");
                return;
            }
            mas1 = args[0].split(" ");
            mas2 = args[1].split(" ");
            String[] mas = new String[mas1.length + mas2.length];

            if (k <= mas1.length) {

                for (int i = 0; i < k; i++)
                {
                    mas[i] = mas1[i];
                }
                for (int i = 0; i < mas2.length; i++)
                {
                    mas[i+k] = mas2[i];
                }
                for (int i = k; i < mas1.length; i++)
                {
                    mas[i+mas2.length] = mas1[i];
                }
            } else {
                System.out.println("You enter k more than the length of the first array!");
                System.out.println("Enter 3 arguments:\n1 - array 1\n2 - array 2\n3 - k > 0");
                System.out.println("Example: \"1 2 3 4 5\" \"8 8 8 8\" 2");
                return;
            }

            for (String a : mas){
                System.out.print(a + " ");
            }



        } else {

            System.out.println("Enter 3 arguments:\n1 - array 1\n2 - array 2\n3 - k > 0");
            System.out.println("Example: \"1 2 3 4 5\" \"8 8 8 8\" 2");
        }
    }
}
