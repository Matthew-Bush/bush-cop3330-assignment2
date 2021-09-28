/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Bush
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        String[] responses = {"Yes","No","Maybe","Ask again later","Hell no"};
        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = sc.nextLine();

        int randomResponseIndex = random.nextInt(responses.length);
        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);
        System.out.println();
    }
}
