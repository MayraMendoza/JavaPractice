package com.hackerrankalgorithms;

import java.util.HashSet;
import java.util.Set;

public class User {
    String userName;
//    Set<String> userName;
//    String Password;


    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "{" +
                "\"userName\":\"" + userName + '"' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
