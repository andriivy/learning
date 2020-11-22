package com.company;

/**
 * Write a program to produce on console the following :
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 * 6 5 4 3 2 1
 * 7 6 5 4 3 2 1
 * 8 7 6 5 4 3 2 1
 */
public class Piramida {

    public static void main(String[] args) {
        int[] x = new int[8];
        int i;
        int y = 1;
        String LineOfPiramid = "";

        for (i = 0; i < x.length; i++) {
            x[i] = y;
            y++;
            LineOfPiramid = x[i] + " " + LineOfPiramid;
            System.out.println(LineOfPiramid);
        }
    }
}
