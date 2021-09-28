/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Bush
 */
package ex24;

import java.util.*;

public class AnagramChecker {
    static boolean Anagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two strings to determine if they're anagrams!");
        System.out.print("Enter first string: ");
        String str1=sc.nextLine();

        System.out.print("Enter second string: ");
        String str2=sc.nextLine();
        if(Anagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str1 + " and " + str2 + " are not anagrams");


    }
}
