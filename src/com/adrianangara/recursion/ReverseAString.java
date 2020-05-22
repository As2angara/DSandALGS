package com.adrianangara.recursion;

public class ReverseAString {

    //Reverse a string that has been inputted by the user

    //Implementation #1
    public String reverseAString(String s) {

        //If empty string, return
        if (s.equals("")) {
            return "";
        }

        //Get the first character
        String c0 = s.substring(0, 1);

        //Get the last character
        String cn = s.substring(s.length() - 1, s.length());

        //Get the index of each character
        int n = s.indexOf(c0);
        int m = s.lastIndexOf(cn);

        //return nothing in the indexes are the same
        if (n == m) {
            return s;
        }


        return cn + reverseAString(s.substring(1, s.length() - 1)) + c0;
    }

}
