package com.company;


import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        for ( int i = 20;i<=40;i++)
        {
           if (i >= 30 && i <= 35)
               continue;

           System.out.println(i);


        }

    }
}
