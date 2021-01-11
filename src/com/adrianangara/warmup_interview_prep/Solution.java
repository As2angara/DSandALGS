import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        
        int numPairs = 0;
        //Get unique values into an array
        Integer[] unique = Arrays.stream(ar).distinct().boxed().toArray(Integer[]::new);
        
        for (int i: unique) {
            int count = 0;
            int temp = 0;
            
            for (int j: ar) {
                if(i == j) {
                    count++;
                }
            }
            
            temp = (int) Math.floor(count / 2);
            
            numPairs = numPairs + temp;
        }
        
        return numPairs;

    }

    public static int countingValleys(int steps, String path) {
    // Write your code here
        int count = 0;
        int seaLvl = 0;
    
        for (int i = 0; i < steps; i++) {
            
            if(path.charAt(i) == 'U') {
                seaLvl++;
                
                if (seaLvl == 0) {
                    count++;
                }
            }
            
            if(path.charAt(i) == 'D') {
                seaLvl--;
            }
            
        }
    
        return count;
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0; 
        
        for (int i = 0; i < c.length; i++) {
            if (i < c.length - 2 && c[i+2] == 0) {
                count++;
                i++;
            }else if (i < c.length - 1 && c[i+1] == 0) {
                count++;
            }
        }
        
        
        return count;
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long len = s.length();
        long mod = n % len;
        long num_repeat = (n - mod) / s.length();
        
        long num_a = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') num_a++;
        }
        
        //calulate num a's from repeat
        num_a = num_a * num_repeat; 
        
        //calculate num a's from left over
        for (int i = 0; i < mod; i++) {
            if (s.charAt(i) == 'a') num_a++;
        }
        
        return num_a;
        
         
    }

}