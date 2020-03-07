package com.chen.cardGame;
import java.util.*;

public class zuobaozi extends Thread{
    private baozi bz;
    public zuobaozi(String name, baozi bz)
    {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
//        super.run();
        while(true)
        {
            synchronized (bz)
            {
                if(bz.flag)
                {
                    try{
                        bz.wait();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println("zuobaozi.....");
                bz.flag = true;
                bz.pier = "bopier";
                bz.xianer = "BBQ pork";
                bz.notify();
            }
        }
    }
}
