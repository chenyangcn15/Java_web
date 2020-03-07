package com.chen.cardGame;
import java.util.*;

public class game {
    public static void main(String[] args)
    {
        HashMap<Integer, String> card = new HashMap<Integer, String>();
        HashSet<String> color = new HashSet<String>();
        HashSet<String> number = new HashSet<String>();

        Collections.addAll(color, "spades", "hearts", "diamonds", "clubs");
        Collections.addAll(number, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
        //create the poker cards
        int count = 0;
        card.put(count++, "Joker1");
        card.put(count++, "Joker2");

        for(String c: color)
        {
            for(String n : number)
            {
                System.out.println("the count is" + count);
                card.put(count++, c + n);
            }
        }
        //shuffle the card
        Set<Integer> c = card.keySet();
        ArrayList<Integer> c2 = new ArrayList<Integer>();
        c2.addAll(c);


        Collections.shuffle(c2);
        System.out.println("the count is" + count);

        //create three users
        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();

        for(int cccc: c2)
        {
            if(count > 51)
            {
                left.add(card.get(cccc));
            }
            else {
                if (count % 3 == 0) {
                    user1.add(card.get(cccc));
                } else if (count % 3 == 1) {
                    user2.add(card.get(cccc));
                } else {
                    user3.add(card.get(cccc));
                }
            }
            count--;
        }

        //display card
        System.out.print(user1.toString() + "\n");
        System.out.print(user2.toString() + "\n");
        System.out.print(user3.toString() + "\n");
        System.out.print(left.toString() + "\n");

        System.out.print(user1.size() + "\n");
        System.out.print(user2.size() + "\n");
        System.out.print(user3.size() + "\n");
        System.out.print(left.size() + "\n");

    }
}
