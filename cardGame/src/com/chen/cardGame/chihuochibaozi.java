package com.chen.cardGame;

public class chihuochibaozi {
    public static void main(String[] args)
    {
        baozi bz = new baozi();
        Thread chibaozi = new chibaozi("chi", bz);
        Thread zuobaozi = new zuobaozi("zuo", bz);

        chibaozi.start();
        zuobaozi.start();
    }
}
