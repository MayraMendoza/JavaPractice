package com.hackerrankalgorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class AppleAndOranges {
    /*
    Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
     Using the information given below, determine the number of apples and oranges that land on Sam's house.
     */
    /**
     *
     * @param s starting point of sam's location
     * @param t end point of sam's location
     * @param a location of apple tree
     * @param b location of range trees
     * @param apples integer array, distance at which each apple falls from the tree
     * @param oranges integer array, distance at which ech orange falls from the tree
     */


    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        //s&t are home "inclusive"
        // apple tree is located at a
        // orange tree is located at b
        int numOfApplesInProperty=0;
        for(int i=0; i<apples.size(); i++){
            int location = a + apples.get(i);
            if(s<= location && location <=t){
                numOfApplesInProperty++;
            }

        }
        int numOfOrangesInProperty = 0;
        for(int i=0; i< oranges.size();i++){
            int location = b + oranges.get(i);
            if(s<= location && location <= t){
                numOfOrangesInProperty++;
            }


        }
        System.out.print(numOfApplesInProperty+"\n"+numOfOrangesInProperty);

    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int s = Integer.parseInt(firstMultipleInput[0]);
//
//        int t = Integer.parseInt(firstMultipleInput[1]);
//
//        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int a = Integer.parseInt(secondMultipleInput[0]);
//
//        int b = Integer.parseInt(secondMultipleInput[1]);
//
//        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int m = Integer.parseInt(thirdMultipleInput[0]);
//
//        int n = Integer.parseInt(thirdMultipleInput[1]);
//
//        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        Result.countApplesAndOranges(s, t, a, b, apples, oranges);
//
//        bufferedReader.close();
//    }
//}
