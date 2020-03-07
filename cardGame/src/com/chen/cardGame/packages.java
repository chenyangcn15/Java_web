package com.chen.cardGame;

public class packages {
    String pack;
    boolean transfer = true;

    public synchronized void send(String pack) throws InterruptedException {
        System.out.println("send");
        if(!transfer) {
            try{
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        transfer = false;
        this.pack = pack;
        System.out.println("is sending");

        notify();
//        notifyAll();
    }

    public synchronized void receive() throws InterruptedException {
        System.out.println("receive");
        if(transfer)
        {
            try{
                System.out.println("receive waiting");
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        transfer = true;
        notify();
//        notifyAll();
        System.out.println("receive message:" + pack);
    }

}
