package com.example.admin.firstcodingtest;

import java.util.ArrayList;

/**
 * Created by Admin on 8/29/2017.
 */

public class CodingTest {

    public static void main(String[] args) {

        // PROBLEM 1 - If divisible by 3 (output "fizz"), If divisible by 5 (output "buzz"), If divisible by both (output "fizz buzz")
        boolean isDivisible3;
        boolean isDivisible5;
        boolean isDivisibleBoth;

        for (int i = 1; i < 21; i++) {

            isDivisible3 = i % 3 == 0;
            isDivisible5 = i % 5 == 0;

            if (i % 5 == 0 && i % 3 == 0) {
                isDivisibleBoth = true;
            } else {
                isDivisibleBoth = false;
            }

            printBuzz(i, isDivisible3, isDivisible5, isDivisibleBoth);

        }
        // END OF PROBLEM 1

        //PROBLEM 2 - Print out the duplicate strings in a arraylist of strings
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");

        printArrayList(stringArrayList);
        //END OF PROBLEM 2
    }

    public static void printBuzz(int i, boolean isDiv3, boolean isDiv5, boolean isDivBoth){

        if(isDiv3 && isDivBoth == false) {
            System.out.print("fizz\n");
        }
        else if (isDiv5 && isDivBoth == false) {
            System.out.print("buzz\n");
        }
        else if(isDivBoth){
            System.out.print("fizz buzz\n");
        }
        else{
            System.out.print(i + "\n");
        }
    }

    public static void printArrayList(ArrayList<String> args) {

        int x = 0, y;
        for(String obj: args){
            x++;
            y=0;
            for (String obj2: args) {
                y++;
                if (y>x){
                    if (obj==obj2){
                        System.out.println(obj);
                    }
                }

            }

        }
    }
}
