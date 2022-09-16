package com.hackerrankalgorithms;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


    User one = new User("Mayra601m");

    User two = new User("Mayra601m");

    Set<User> userNameSet= new HashSet<>();

    userNameSet.add(one);
    userNameSet.add(two);

    System.out.println(userNameSet.contains(two.getUserName()));
    System.out.println(two.getUserName());


    System.out.print(userNameSet);


    }
}
