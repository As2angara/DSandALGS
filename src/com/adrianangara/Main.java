package com.adrianangara;

import com.adrianangara.recursion.SumOfSquares;

public class Main {

    public static void main(String[] args) {

        //Calculate the sum of squares between 7 and 10
        int n =7, m =10;
        SumOfSquares sos = new SumOfSquares();
//        int sum = sos.sumOfSquares2(n, m); //Implementation #1
        int sum = sos.sumOfSquares2(n, m); //Implementation #2
        System.out.println("The sum of squares between " + n + " and " + m + " is: " + sum);



    }
}
