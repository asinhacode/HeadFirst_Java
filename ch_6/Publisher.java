package com.company.inheritance;

import java.util.ArrayList;

public class Publisher
{
    final String name;
    private boolean isBaptised;
    private String congregation;
    private ArrayList<Integer> serviceHours = new ArrayList<>();



    public Publisher(String n, boolean isBap, String c)
    {
        name = n;
        isBaptised = isBap;
        congregation = c;
    }

    public String getName() {
        return name;
    }

    /*public int[] getServiceHours() {
        return serviceHours;
    }

    public void setServiceHours(int[] serviceHours) {
        this.serviceHours = serviceHours;
    }*/

    public boolean isBaptised() {
        return isBaptised;
    }

    public void setBaptised(boolean baptised) {
        isBaptised = baptised;
    }


    public String getCongregation() {
        return congregation;
    }

    public void setCongregation(String congregation) {
        this.congregation = congregation;
    }

    public void addMonthlyHours(int index, int hours)
    {
        serviceHours.add(index, hours);
        System.out.println(serviceHours);
    }

    public void currentInfo()
    {
        System.out.println("Name:\t" + getName() + "\nIs_Baptised:\t" + isBaptised() + "\nCurrent_Congregation:\t" + getCongregation() + "\nService_Hours:\t" + serviceHours);
    }

}
