package com.epam;


public class Task1_8 {

    public static void main(String[] args) {

        int  k;
        String [] mas;
        int sum = 0;
        if (args.length == 2) {

            try {
                k = Integer.parseInt(args[1]);
                if (k <= 0)
                {
                    System.out.println("Enter 2 arguments:\n1 - A[N] where N > 0\n2 - K > 0\nYou have K <= 0!");
                    return;
                }
                mas = args[0].split(" ");
                int[] a = new int[mas.length];
                for (int i = 0; i < mas.length; i++)
                {
                    a[i] = Integer.parseInt(mas[i]);
                    if (a[i] <= 0)
                    {
                        System.out.println("Enter 2 arguments:\n1 - A[N] where N > 0\n2 - K > 0\nYou have N <= 0!");
                        return;
                    }
                    if(a[i]%k == 0){
                        sum += a[i];
                    }
                }

                System.out.println(sum);

            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 2 arguments:\n1 - A[N] where N > 0\n2 - K > 0\nExample: \"2 9 7 4 6\" 2");
                return;
            }

        } else {

            System.out.println("Enter 2 arguments:\n1 - A[N] where N > 0\n2 - K > 0\nExample: \"2 9 7 4 6\" 2");
        }
    }
}
