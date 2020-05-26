package com.adrianangara.recursion;

public class AllPossibleSums {

    // Find all possible sums of elements in a given array
    // ex: {1, 2, 4} | possible sums => 1, 3, 6, 5, etc..

    public void subsetSum(int[] arr, int i, int n, int sum) {

        if (i < n) {
            subsetSum(arr, i+1, n, sum);

            subsetSum(arr, i+1, n, sum + arr[i]);
        } else {
            System.out.println(sum);
        }
    }

}
