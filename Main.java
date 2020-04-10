package com.codewithme;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[][] matrix =new int[2][2];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter "+matrix.length+ "rows and "+matrix[0].length+"  cols");
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                matrix[row][col]=scanner.nextInt();
            }
        }
       //tìm gtri nho nhat
        int min = matrix[0][0];
        for (int row=0;row<matrix.length;row++){
            for (int col=1;col<matrix[row].length;col++){
                if (matrix[row][col]<min){
                    min=matrix[row][col];
                }
            }
        }
        System.out.println("min value is: "+min);


    }
}
