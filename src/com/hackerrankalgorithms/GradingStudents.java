package com.hackerrankalgorithms;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        // multiple of 5 (if diff is less than 3 then bump to next multiple of 5 ). 53-> 55   58---> 60.
        // if grade> 38 (not inclusive)-- do nothing
        // if grade % 5  is less than 3 then round to next multiple of 5
        // {how to round number - diff +5 ?}
        //
        //
        ArrayList<Integer> updatedGrades = new ArrayList<>();
        int currentGrade =0;
        int roundUp = 0;
        for (int i=0; i<grades.size(); i++){
            currentGrade = grades.get(i);

            roundUp = (currentGrade -(currentGrade% 5) +5 ) - currentGrade;
            System.out.println(roundUp);

            if(currentGrade< 38){
                updatedGrades.add(currentGrade);
            } else if (roundUp < 3){
                updatedGrades.add(currentGrade+roundUp);
            }else {
                updatedGrades.add(currentGrade);
            }

        }
        return updatedGrades;




    }
}
