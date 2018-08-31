package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num1 = 6;
        int num2 = 5;
        int num3 = 7;
        int num4 = 8;

        //Addition
        int res1 = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + res1);

        //Subtraction
        int res2 = num4 - num3;

        System.out.println(num4 + " - " + num3 + " = " + res2);

        //Multiplication
        int res3 = num2 * num4;

        System.out.println(num2 + " * " + num4 + " = " + res3);

        //Dividing
        double res4 = (double) num4 / num2;

        System.out.println(num4 + " / " + num2 + " = " + res4);

        //Module
        double res5 = (double) num3 % num1;

        System.out.println(num3 + " % " + num1 + " = " + res5);

    }
}
