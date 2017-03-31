package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Podaj wielkosc wiezyczki");
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        int wielkosc = odczyt.nextInt();
        int i;

        for (i = 1; i <= wielkosc; i++)
        {

            System.out.print("*");

            for (int k = 1; k < i; k++)
            {
                System.out.print("*");
            }

            System.out.println();



        }
    }
}
