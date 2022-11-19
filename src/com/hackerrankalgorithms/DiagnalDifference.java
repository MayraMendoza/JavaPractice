package com.hackerrankalgorithms;

import java.util.List;

public class DiagnalDifference {
    //Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int length = arr.size();
        int totalLeft = 0;
        int totalRight=0;

        for(int i=0; i<length; i++){
            totalLeft += arr.get(i).get(i);

        }
        int count = 0;
        for(int j=length-1; j>=0; j--){
            totalRight += arr.get(count).get(j);
            count++;

        }

        return Math.abs(totalLeft-totalRight);

    }

}
