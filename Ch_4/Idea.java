package com.company.ch4;

public class Idea
{
    int size;

    public Idea(int s)
    {
        this.size = s;
    }

    public void profit(int size)
    {
        if(size > this.size)
            System.out.println("Bigger than you by\t" + compare(size));

        else
            System.out.println("Less than you\t" + compare(size));
    }

    private int compare(int size)
    {
        return Math.abs(this.size - size);
    }
}
