package com.bootcoding.java.multithreading.thread;

public class PalindromeThread extends Thread{

    @Override
    public void run() {
        for(int num = 100; num <=1000000000000000000l; num++ ){
            int original = num;
            int reverse = 0;
            while (original > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                original /= 10;
            }
            if (num == reverse) {
                System.out.println(num + " Number is Palindrome");
            } else {
                System.out.println(num + " Number is not a Palindrome");
            }
        }
    }


}
