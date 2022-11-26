package com.hackerrankalgorithms;

/**
 * Staircase detail
 *
 * This is a staircase of size n=4:
 *
 *    #
 *   ##
 *  ###
 * ####
 * Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 *
 * Write a program that prints a staircase of size .
 */
public class StairCase {
    public static void staircase(int n) {
        // Write your code here
        int stair = n-1;
        for(int i = 0 ; i<n ;i++){
            //n-10 want to print this 10 times
            for (int j =0 ; j<n ; j++){
                if(j>=stair){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }


            }
            stair -=1;
            System.out.print("\n");

        }

    }
}
