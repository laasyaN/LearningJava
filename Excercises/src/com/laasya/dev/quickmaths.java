package com.laasya.dev;

import java.util.Scanner;


public class quickmaths {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        System.out.print("What is the first number?");
        int firstnumber = in.nextInt();
        System.out.print("What is the second number?");
        int secondnumber = in.nextInt();



        double sum = firstnumber + secondnumber;
        double subtract = firstnumber-secondnumber;
        double multiply = firstnumber*secondnumber;
        double divide = firstnumber/secondnumber;



        System.out.print(firstnumber + "+" + secondnumber + "=" + sum );
        System.out.print("         ");
        System.out.print(firstnumber + "-" + secondnumber + "=" + subtract);
        System.out.print("         ");
        System.out.print(firstnumber + "*" + secondnumber + "=" + multiply);
        System.out.print("         ");
        System.out.print(firstnumber + "/" + secondnumber + "=" + divide);
        System.out.print("         ");



    }
}
