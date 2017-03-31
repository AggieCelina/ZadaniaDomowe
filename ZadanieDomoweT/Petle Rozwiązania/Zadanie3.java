package com.company;


import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        int liczba;
        Random losowanie = new Random();
        for ( int i = 0;i<10;i++)
        {
            liczba = losowanie.nextInt();

            System.out.println(liczba);

        }

    }
}
