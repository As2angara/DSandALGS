package com.adrianangara;

import com.adrianangara.recursion.ReverseAString;
import com.adrianangara.recursion.SumOfSquares;
import com.adrianangara.recursion.TowersOfHanoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Calculate the sum of squares between 7 and 10
//        int n =7, m =10;
//        SumOfSquares sos = new SumOfSquares();
////        int sum = sos.sumOfSquares2(n, m); //Implementation #1
//        int sum = sos.sumOfSquares2(n, m); //Implementation #2
//        System.out.println("The sum of squares between " + n + " and " + m + " is: " + sum);

        //Reverse a string inputted by the user
//        Scanner in = new Scanner(System.in);
//        ReverseAString rev = new ReverseAString();
//
//        String s = in.nextLine();
//        System.out.println(rev.reverseAString(s));

        //Move the disks in the tower of hanoi
        TowersOfHanoi toh = new TowersOfHanoi();
        int start = 1, spare = 2, finish = 3;

        toh.moveTowers(start, spare, finish, finish);

    }
}
