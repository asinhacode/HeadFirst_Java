package com.company.ch4;

public class Ch4
{
    public static void main(String[] args)
    {
        //Idea mine = new Idea(10);
        //mine.profit(7);

        Ministry year2020[] = new Ministry[12];
        year2020[0] = new Ministry(11, "January");
        year2020[1] = new Ministry(3, "February");

        System.out.println(year2020[0].toString());
        System.out.println(year2020[1].toString());

        year2020[1].incrementHours();
        System.out.println(year2020[1].toString());



    }



}
