package com.hackerrankalgorithms;

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

class BirthdayCakeCandles {


    /*
     *You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
     *They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        // Collections.sort(candles, Collections.reverseOrder());
        // int countHeighestCandles = 1;
        // int max=candles.get(0);
        // for(int i=1; i<candles.size();i++){
        //     if(max==candles.get(i)){
        //         countHeighestCandles++;
        //     }
        // }
        // return(countHeighestCandles);

        int highestCandleCount=0;
        int max=0;
        for(int i=0; i<candles.size();i++){
            if(candles.get(i)>max){
                max= candles.get(i);
                highestCandleCount =1;

            }
            else if(max== candles.get(i)){
                highestCandleCount++;
            }
        }
        return(highestCandleCount);


    }

//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            int result = Result.birthdayCakeCandles(candles);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
    }
