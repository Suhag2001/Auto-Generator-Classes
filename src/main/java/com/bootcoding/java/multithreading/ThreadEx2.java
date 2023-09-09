package com.bootcoding.java.multithreading;

import com.bootcoding.java.multithreading.letters.AlphabetThread;
import com.bootcoding.java.multithreading.letters.NumberThread;
import com.bootcoding.java.multithreading.letters.SpecialSymbolThread;

public class ThreadEx2 {
    public static void main(String[] args) {
//         Using Thread
        Thread t1 = new NumberThread();
        t1.start();
        Thread t2 = new AlphabetThread();
        t2.start();
        Thread t3 = new SpecialSymbolThread();
        t3.start();
    }
}
