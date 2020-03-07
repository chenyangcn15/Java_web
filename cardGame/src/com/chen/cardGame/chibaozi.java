package com.chen.cardGame;
import java.util.*;

public class chibaozi extends Thread{
    private baozi bz;

    public chibaozi(String name, baozi bz)
    {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
       while(true)
       {
           synchronized (bz)
           {
               if(bz.flag == false)
               {
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println("chihuo is eating " + bz.pier + " "+ bz.xianer);
               bz.flag = false;
               bz.notify();
           }
       }
    }
}
