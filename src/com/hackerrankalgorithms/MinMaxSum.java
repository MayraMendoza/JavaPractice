package com.hackerrankalgorithms;

import java.util.Collections;
import java.util.List;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        long max =0;
        long min =0;
        for(int i =0; i<arr.size()-1; i++){
            min += arr.get(i);
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(int i =0; i<arr.size()-1; i++){
            max += arr.get(i);
        }
        System.out.print(min +" "+max );
    }

}
