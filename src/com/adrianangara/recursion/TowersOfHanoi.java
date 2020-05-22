package com.adrianangara.recursion;

public class TowersOfHanoi {

    //There are 3 pegs with the first one holding 3 disks that are assorted from largest to smallest radius
    //starting from the bottom. The goal is to move all the disks to the last peg. Only one can be moved at
    //one time. Larger disks can not be places above smaller ones

    //Implementation #1
    public void moveTowers(int start, int spare, int finish, int n) {

        if(n == 1) {
            System.out.println("Move disk from "+start+ " to " + finish);
        } else {

            moveTowers(start, finish, spare, n-1);
            System.out.println("Move disk from " + start + " to " + finish);
            moveTowers(spare, start, finish, n-1);
        }
    }
}
