package com.laasya.dev;

import java.util.Scanner;


public class retirement {
    public static void main(String[] args) {

        System.out.print("What is your current age?");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        System.out.print("At what age would you like to retire?");
        int rage = in.nextInt();

        int time = rage-age;
        int year = 2018 + time;

        if (time <= 0) {
            System.out.print(" you already should be retired");
        }

        else if (time > 0) {
            System.out.print("You have " + time + " years left until you can retire");
            System.out.print(" --- ");
            System.out.print("Its 2018, so you can retire in " +  year);
        }


    }
}
