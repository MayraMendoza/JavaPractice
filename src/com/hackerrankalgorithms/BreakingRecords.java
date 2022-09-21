package com.hackerrankalgorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BreakingRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
     *  She tabulates the number of times she breaks her season record for most points and least points in a game.
     * Points scored in the first game establish her record for the season, and she begins counting from there.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = scores.get(0);
        int max=scores.get(0);

        List<Integer> breakingRecords = new ArrayList<>(Arrays.asList(0,0));

        for(int i=1; i< scores.size();i++){

            if(max > scores.get(i)){
                max = scores.get(i);
                breakingRecords.set(1,breakingRecords.get(1)+1);
            }
            if( min< scores.get(i)){
                min = scores.get(i);
                breakingRecords.set(0, breakingRecords.get(0)+1);
            }





        }
        return breakingRecords;

    }
}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = Result.breakingRecords(scores);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}