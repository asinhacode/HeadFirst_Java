package com.company.ch4;

public class Ministry
{
    private int hours;
    private String month;

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public void incrementHours()
    {
        this.hours++;
    }

    public Ministry(int h, String m)
    {
        this.hours = h;
        this.month = m;
    }

    public String toString()
    {
        return this.getMonth() + " = " + this.getHours() + " hours.";
    }

}
