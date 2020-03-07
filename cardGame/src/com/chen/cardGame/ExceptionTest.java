package com.chen.cardGame;
import java.lang.*;


public class ExceptionTest {
    public static String[] nameList = {"chen", "yang", "hang", "zhao"};

    public static void main(String[] args)
    {
        try{
            checkName("chen");
            System.out.println("... successful");

        }
        catch(customizedException e)
        {
            e.printStackTrace();
        }
    }

    public static boolean checkName(String name) throws customizedException {
        for(String n : nameList)
        {
            if(n.equals(name)) {
                throw new customizedException("this name: " + name + " is existed!");
            }
        }
        return true;
    }
}
