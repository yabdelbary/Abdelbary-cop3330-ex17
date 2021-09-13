package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        Scanner sc = new Scanner(System.in);
        int gender = Integer.parseInt(sc.nextLine());
        System.out.println("How many ounces of alcohol did you have?" );
        int ounces = Integer.parseInt(sc.nextLine());
        System.out.print("What is your weight, in pounds?");
        int weight = Integer.parseInt(sc.nextLine());
        System.out.println("How many hours has it been since your last drink? ");
        int hours = Integer.parseInt(sc.nextLine());
        double ratio;
        if(gender == 1){
             ratio = 0.73;
        }else{
             ratio = 0.66;
        }
        double BAC = (double)((ounces * (5.14 / weight)*ratio) - .015 * hours);
        System.out.printf("Your BAC is %.6f", BAC);
        if(BAC >= 0.08){
            System.out.println("\nIt is not legal for you to drive.");
        }else{
            System.out.println("\nIt is legal for you to drive.");
        }
    }
}
