package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    // write your code here

        //ZADANIE 3;
        //a
        int a = 50;
        int b = 11;

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
