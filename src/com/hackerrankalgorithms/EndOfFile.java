package com.hackerrankalgorithms;

import java.util.Scanner;

/**
 * The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 */

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int number = 1 ;
        while(scan.hasNext()){
            String it = scan.nextLine();
            System.out.println(number + " " + it);
            number ++;
        }
    }
}
