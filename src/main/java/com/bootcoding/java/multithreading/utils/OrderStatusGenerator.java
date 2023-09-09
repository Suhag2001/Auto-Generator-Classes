package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class OrderStatusGenerator {
    private static final String[] statuses = {"NEW", "ACCEPTED", "DELIVERED", "DISPATCHED", "CANCELLED"};

    public static String getStatus() {
        
        int randomIndex = random.nextInt(statuses.length);
        return statuses[randomIndex];
    }

    private static Random random = new Random();
}
