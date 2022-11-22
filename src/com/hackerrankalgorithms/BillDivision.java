package com.hackerrankalgorithms;

import java.util.List;

public class BillDivision {
    //Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume.
    // Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.
    //
    //For example, assume the bill has the following prices: bill = [2,4,6]. Anna declines to eat item  which costs 6 .
    // If Brian calculates the bill correctly, Anna will pay (2+4)/2=3 . If he includes the cost of bill[2] ,
    // he will calculate (2+4+6)/2=6. in the second case, he should refund 3 to anna.

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        // arra--- all items orderd
        // k item ann does eat
        // b -- $ anna contributes.
        // add all the numbers in array, subtract value of k then divide by 2
        // if that total == b then return bon appetite if doesnt then
        // return b(total amount given by anna) -(total - k /2 )

        int totalBill = 0;
        int contribution = 0;

        for(int i=0; i<bill.size(); i++){
            totalBill += bill.get(i);
        }

        contribution = (totalBill - bill.get(k))/2;

        if(contribution== b){
            System.out.print("Bon Appetit");
        }else{
            System.out.print(b-contribution);
        }

    }
}
