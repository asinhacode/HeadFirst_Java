/**
 * 3 arrays and random selection
 */
package com.company;

public class Insane
{

    public static void main(String[] args)
    {
       // threeArray();

        Phone Apple = new Phone("IPhone11", 1800, true);
        Phone Samsung = new Phone("Notebook", 1200, true);
        Phone LG = new Phone("LG", 800, false);

        Phone all[] = {Apple, Samsung, LG};
        
        System.out.println(all[0].isCool());
        System.out.println(all[1].isCool());
        System.out.println(all[2].isCool());


        System.out.println(Apple.difference(Samsung));
    }

        public static void threeArray()
        {
            String names[] = {"Anupam", "Amritasu", "Sharmistha"};
            String verbs[] = {"Running", "Working", "Sleeping", "Travelling"};
            String adverbs[] = {"slowly", "hardly", "peacefully", "aimlessly"};

            System.out.println(names[(int)(Math.random() * names.length)] + " " + verbs[(int)(Math.random() * verbs.length)] + " " + adverbs[(int)(Math.random() * adverbs.length)]) ;

        }
}


