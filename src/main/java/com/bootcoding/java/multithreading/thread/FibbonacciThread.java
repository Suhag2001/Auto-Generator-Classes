package com.bootcoding.java.multithreading.thread;

public class FibbonacciThread extends Thread{

    @Override
    public void run() {
        int prev = 0, curr = 1;
        while (prev + curr <=1000000000000000000l) {
            int next = prev + curr;
            System.out.println(next + " is a Fibbocacci Number ");
            prev = curr;
            curr = next;
        }
        System.out.println();
    }


}
