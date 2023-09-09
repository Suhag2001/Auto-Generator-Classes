package com.bootcoding.java.multithreading;

import com.bootcoding.java.multithreading.thread.FibbonacciThread;
import com.bootcoding.java.multithreading.thread.PalindromeThread;
import com.bootcoding.java.multithreading.thread.PrimeNumberThread;

public class ThreadEx1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread t1 = new FibbonacciThread();
        t1.start();
        Thread t2 = new PalindromeThread();
        t2.start();
        Thread t3 = new PrimeNumberThread();
        t3.start();
    }
}
