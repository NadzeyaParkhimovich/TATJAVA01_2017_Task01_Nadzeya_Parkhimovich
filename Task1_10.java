package com.epam;


public class Task1_10 {
    public static void main(String[] args) {

        int n;

        if (args.length == 1) {

            try {
                n = Integer.parseInt(args[0]);
            }catch (java.lang.NumberFormatException e){

                System.out.println("Enter 1 argument, an an even number > 0.");
                return;
            }

            if (n > 0 && n%2 == 0)
            {
                int[][] matrix = new int [n][n];
                for (int i = 0; i < n; i++)
                {
                    if (i%2 == 0){
                        for (int j = 0; j < n; j++)
                        {
                            matrix[i][j] = j + 1;
                        }
                    } else {
                        for (int j = 0; j < n; j++)
                        {
                            matrix[i][j] = n - j;
                        }
                    }
                }

                for (int i = 0; i < n; i++)
                {
                    for (int j = 0; j < n; j++)
                    {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Enter 1 argument, an an even number > 0. Your number is not even!");
            }

        } else {

            System.out.println("Enter 1 argument, an an even number > 0.");
        }
    }
}
