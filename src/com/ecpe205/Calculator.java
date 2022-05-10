package com.ecpe205;

import java.util.Queue;
import java.util.Stack;



public class Calculator {
    public double sum( double a, double b ) {
        return a + b;
    }
    public boolean isEven (int value) {
        return value % 2 == 0;
    }
    public boolean isOdd (int value) {
        return value % 2 == 1;
    }

    public double base(int x, int y) { return Math.pow(x, y);}

    public long factorial(int a) {int fact =1;
        for(int i=1;i<=a ;i++){
            fact=fact*i;
        }return fact;}

    public static boolean isPalindrome(String name) {
        String originalString = name;
        int i = 0, j = name.length() - 1;
        while (i < j) {
            if (name.charAt(i) != name.charAt(j)) return false;
            i++;
            j--;
        }
        return originalString.equalsIgnoreCase(name);
    }

        //create a method that computes base x power of y
        //use parameterizedTest methodsource - 5 sets to test

        //create a method that computes for the factorial of a value
        //use parameterizedTest- 5 values to test

        //create a method that checks if a given string is a palindrome
        //use parameterizedTest - 5 values to test

        //create a method that accepts an array of integer values, the method then sorts the value in ascending order
        //** you may choose whatever sort data structure (bubble sort, shell sort,...)
        //use parameterizedTest methodSource
    }