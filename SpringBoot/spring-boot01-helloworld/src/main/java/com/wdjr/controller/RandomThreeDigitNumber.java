package com.wdjr.controller;

import java.util.Random;

public class RandomThreeDigitNumber {

    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(999);
        int b = random.nextInt(999);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
}