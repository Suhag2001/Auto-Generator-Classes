package com.bootcoding.java.multithreading.store;

//import com.bootcoding.java.multithreading.letters.AlphabetThread;
//import com.bootcoding.java.multithreading.letters.NumberThread;
//import com.bootcoding.java.multithreading.letters.SpecialSymbolThread;
import com.bootcoding.java.multithreading.store.bag.BagService;
import com.bootcoding.java.multithreading.store.book.BookService;
import com.bootcoding.java.multithreading.store.bottle.BottleService;

public class Shopkeeper {

    public static void main(String[] args) {
        // Using Runnable
        Thread t11 = new Thread(new BookService(1000));
        Thread t22 = new Thread(new BottleService(1000));
        Thread t33 = new Thread(new BagService(1000));
        t11.start();
        t22.start();
        t33.start();

    }
}
