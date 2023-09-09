package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class PhoneNumberGenerator {

    final static int MAX = 999999999;
    final static int MIN = 980000000;

    public static int getPhoneNumber() {
        int number = random.nextInt(MAX - MIN); // 899999
        int otp = MIN + number;
        System.out.println(" Phone Number = " + otp);
        return otp;
    }

    private static Random random = new Random();

}
