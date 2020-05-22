package com.adrianangara.recursion;

public class MinNumber {

    //Given an array, find the min value in the array using recursion

    //Implementation #1
    public int getMin(int[] arr, int i, int n) {

        if( i == n-1) {
            return arr[i];
        } else {
            int curr = arr[i];
            int minRest = getMin(arr, i+1, n);

            if(curr < minRest) {
                return curr;
            } else {
                return minRest;
            }
        }

    }

}
