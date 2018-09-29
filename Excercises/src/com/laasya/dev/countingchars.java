package com.laasya.dev;

import java.util.Scanner;

public class countingchars {

    public static void main(String[] args) {

        System.out.print("What is the input string?");

        Scanner in = new Scanner(System.in);

        String input = in.nextLine().trim().replace(" ","");
        int count = input.length();

        System.out.print(input + " has" + " " + count + " " + "characters.");

    }
}
