package com.company;

public class Phone
{
    // instance variable
    String brandName;
    double price;
    boolean cool;

    public Phone(String bN, double p, boolean c)
    {
        brandName = bN;
        price = p;
        cool = c;
    }

    boolean isCool()
    {
        return cool;
    }

    double difference(Phone competition)
    {
        return this.price - competition.price;
    }
}
