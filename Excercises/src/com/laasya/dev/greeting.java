package com.laasya.dev;

import java.util.Scanner;


public class greeting {

    public static void main(String[] args) {

        System.out.print("What is your name?");

        Scanner in = new Scanner(System.in);

        String name = in.next();


        System.out.print("Hello " + name);



    }
}


