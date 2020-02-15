package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main
{

    public static void main(String[] args)
    {
     /*   ArrayList<Integer> days = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            days.add(i);
        }
       // for(int i = 0; i < 10; i++)

            System.out.println(days);

        *//*Iterator<Integer> iter = days.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }*//*

        if(days.contains(9))
        {
            days.remove(9);
        }
        System.out.println(days);

        if(days.contains(3))
        {
            days.remove(3);
        }
        System.out.println(days);

        days.add(11);

        System.out.println(days);*/
        int index = 5;

        ArrayList<Integer> month = new ArrayList<>();
        for (int i = 1; i < index; i++)
        {
            month.add(i);
        }

        ArrayList<String> successOrFailure = new ArrayList<String>();
        for (int i = 1; i < index; i++)
        {
            int success = (int)(Math.random() * 2);

            if(success == 0)
            successOrFailure.add("T");

            else
                successOrFailure.add("F");
        }

        System.out.println(month);
        System.out.println(successOrFailure);



    }
}
