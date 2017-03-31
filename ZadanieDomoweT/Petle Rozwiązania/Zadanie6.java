package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int i=0;
        int liczba;
       do
       {
           System.out.println("Podaj liczbe.");
           Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

           liczba = odczyt.nextInt();
           i=i+liczba;
           System.out.println("Suma:"+i);
       } while (i < 31);

        System.out.println("OK.");

    }
}
