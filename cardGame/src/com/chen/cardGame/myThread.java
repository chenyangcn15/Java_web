package com.chen.cardGame;
import java.lang.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//public class myThread extends Thread{
//    public myThread(String name)
//    {
//        super(name);
//    }
//
//@Override
//    public void run()
//    {
//        for(int i = 0; i < 10; i++)
//        {
//            System.out.println(getName() + " is running" + i);
//        }
//    }
//}

public class myThread implements Runnable{
    private int tickets = 10;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
            lock.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + " sells a ticket" + tickets--);
                lock.unlock();
            }
        }
    }

//    @Override
//    public void run() {
//        while(true)
//        {
//            sellTicket();
//        }
//    }
//
//    public synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            String name = Thread.currentThread().getName();
//            System.out.println(name + " sells a ticket" + tickets--);
//        }
//    }



//    Object lock = new Object();
//
//    @Override
//    public void run() {
//        while(true)
//        {
//            synchronized (lock) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    String name = Thread.currentThread().getName();
//                    System.out.println(name + " sells a ticket" + tickets--);
//                }
//            }
//        }
//    }


}
