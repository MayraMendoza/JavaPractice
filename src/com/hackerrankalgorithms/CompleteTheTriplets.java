package com.hackerrankalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
 *
 * The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
 *
 * The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
 *
 * If a[i] > b[i], then Alice is awarded 1 point.
 * If a[i] < b[i], then Bob is awarded 1 point.
 * If a[i] = b[i], then neither person receives a point.
 * Comparison points is the total points a person earned.
 *
 * Given a and b, determine their respective comparison points.
 */
public class CompleteTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aa = 0;
        int bb = 0;

        for (int i =0 ; i<b.size();i++){
            int aaa = a.get(i);
            int bbb = b.get(i);

            if(aaa> bbb){
                aa = aa+ 1;

            } else if (aaa<bbb){
                bb = bb+1;
            }

        }
        // System.out.print(aa +" "+ bb);
        List<Integer> intArray = new ArrayList<Integer>();
        intArray.add(aa);
        intArray.add(bb);


        return(intArray);

    }
}
