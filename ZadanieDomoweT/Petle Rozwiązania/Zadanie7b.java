package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Podaj wielkosc choinki");
        Scanner odczyt = new Scanner(System.in);
        int wielkosc = odczyt.nextInt();
        
        wielkosc = wielkosc*2;
        int i;

        for (i = 1; i <= wielkosc; i+=2)
        {
                for (int m = (wielkosc - i) / 2; m > 0; m--)
                {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int k = 1; k < i; k++)
                {
                    System.out.print("*");
                }

                System.out.println();



        }
    }
}
