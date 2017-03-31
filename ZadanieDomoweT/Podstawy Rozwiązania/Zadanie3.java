package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    // write your code here

        //ZADANIE 3;
        //a
        System.out.println("Podaj a.");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.println("Podaj b.");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();


        //b
        System.out.println("Dodawanie:");
        System.out.println(a+b);

        System.out.println("Odejmowanie");
        System.out.println(a-b);

        System.out.println("Mnożenie");
        System.out.println(a*b);


        System.out.println("Dzielenie");
        if (b != 0)
        {
            System.out.print(a / b);

            System.out.print(" a reszta : ");
            System.out.print(a%b);
            System.out.print(" z ");
            System.out.println(b);
        }
        else
        {
            System.out.println("Zabrionione dzielenie przez zero");
        }


        System.out.println("Reszta z dzielenia");
        if (b != 0)
        {
            System.out.println(a%b);
        }
        else
        {
            System.out.println("Zabrionione dzielenie przez zero");
        }



        System.out.println("Wyświetlanie większej liczby");
        if (a > b)
        {
            System.out.println(a);
        }
        else if (b > a)
        {
            System.out.println(b);
        }


    }
}
