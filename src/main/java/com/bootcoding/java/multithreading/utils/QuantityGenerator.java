package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class QuantityGenerator {

    public static int getQuantity(int bound) {
        return 1 + random.nextInt(bound);
    }

    public static int getQuantity(int lowerBound, int upperBound){
        return lowerBound + getQuantity(upperBound-lowerBound);
    }


    private static Random random = new Random();
}
