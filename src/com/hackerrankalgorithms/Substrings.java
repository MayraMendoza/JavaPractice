package com.hackerrankalgorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substrings{
    /**
     * given a string [s] and two indices, start and end, print a substring consisting of all characters in the
     * inclusive range from start to end-1. you'll find the string class'.
     * @param args
     */

   /** public String substring(int beginIndex,
                            int endIndex)
    Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to
    the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
    "hamburger".substring(4, 8) returns "urge"
   */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();


        System.out.println( S.substring(start,end));
    }
}