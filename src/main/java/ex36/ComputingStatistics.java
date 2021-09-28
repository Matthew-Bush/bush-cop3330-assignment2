/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Bush
 */
package ex36;

import java.util.*;
import java.lang.*;

public class ComputingStatistics {
    public static void CheckPass(String input) {
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        if (hasDigit && hasLower || hasUpper && specialChar && (n >= 8))
            System.out.println("Very Strong");
        else if ((hasLower || hasUpper || specialChar) && (n >= 8))
            System.out.println("Strong");
        else if (hasLower || hasUpper && (n < 8))
            System.out.print("Weak");
        else
            System.out.print("Very Weak");

    }


    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        input = sc.nextLine();
        CheckPass(input);
    }
}