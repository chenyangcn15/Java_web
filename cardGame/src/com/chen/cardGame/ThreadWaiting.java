package com.chen.cardGame;
import java.lang.Thread;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadWaiting {
   public static void main(String[] args) throws InterruptedException {
       String[] packs = {"p1", "p2", "p3"};
       packages p = new packages();


       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for(String pack : packs)
               {
                   System.out.println(pack + " " + p.transfer + " before sending");
                   try {
                       p.send(pack);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(pack + " " + p.transfer + " after sending");


//                   try{
//                      Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
//                      }
//                   catch(InterruptedException e)
//                   {
//                       e.printStackTrace();
//                   }
               }
           }
       });

       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {

               try {
                   p.receive();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("Thread2 " + " " + p.transfer);
//               try{
//                   Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
//               }
//               catch(InterruptedException e)
//               {
//                   e.printStackTrace();
//               }
           }
       });

       t1.start();
       t2.start();

//       t1.join();
//       t2.join();
   }

}
