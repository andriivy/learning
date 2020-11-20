package com.company;

public class ExampleWithNumbers {

    public static void main(String args[]) {
        int num;
        num = 100;
        System.out.println("Here is variable num: " + num);
        num = num * 3;
        System.out.print("And now num is tripled: ");
        System.out.println(num);

        for (num = num; num <= 10000; num = num + num)
            System.out.println("Now num is: " + num);
    }
}
