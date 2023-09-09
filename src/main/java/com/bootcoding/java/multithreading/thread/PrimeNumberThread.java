package com.bootcoding.java.multithreading.thread;

public class PrimeNumberThread extends Thread{

    @Override
    public void run() {
        for (int num = 0 ; num<10000000; num++) {
            if (num <= 1) {
                System.out.println(num + " is not a Prime Number");
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(num+ " is not a Prime Number");
                }
            }
            System.out.println(num + " is a Prime Number");
        }
    }

    public static void isPrime() {

    }
}
