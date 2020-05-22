package com.adrianangara.recursion;

public class SumOfSquares {

    //Find the sum of squares S(n,m) of integers that fall within a range [n,m]
    //Ex: [7, 10] -> return sum = 7*7 + 8*8 + 9*9 + 10*10

    public int sumOfSquares(int n, int m) {

        if (n == m) {
            return n*n;
        } else {
            return m*m + sumOfSquares(n, m - 1);
        }

    }
}
