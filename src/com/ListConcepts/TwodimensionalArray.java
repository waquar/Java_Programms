package com.ListConcepts;

public class TwodimensionalArray {
    public static void main(String[] args){
        //Declarartion of 2d array
        String x[][] = new String[3][5];  //3 rows 5 coloums
        System.out.println(x.length);   //will return total number of rows
        System.out.println(x[0].length); // will return total number of coloums
        //Assignig values to array
        x[0][0] = "A0";
        x[0][1] = "B0";
        x[0][2] = "C0";
        x[0][3] = "D0";
        x[0][4] = "E0";


        x[1][0] = "A1";
        x[1][1] = "B1";
        x[1][2] = "C1";
        x[1][3] = "D1";
        x[1][4] = "E1";

        x[2][0] = "A2";
        x[2][1] = "B2";
        x[2][2] = "C2";
        x[2][3] = "D2";
        x[2][4] = "E2";

        System.out.println(x[2][1]);

        for(int row = 0 ; row < x.length; row++){
            for (int col= 0; col< x[0].length; col++ ){
                System.out.print(x[row][col]);
            }
            System.out.print("--->");
        }


    }
}
