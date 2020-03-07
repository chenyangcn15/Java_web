package com.chen.cardGame;

public class threadTest {
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("main method is running" + i);
        }
        myThread r = new myThread();
        Thread t2 = new Thread(r, "win2");
        t2.start();
        Thread t = new Thread(r, "win1");
        t.start();

    }
}
