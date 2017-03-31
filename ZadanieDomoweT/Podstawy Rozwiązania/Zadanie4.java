package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here

        //ZADANIE 4;
        //a
        System.out.println("Podaj a.");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.println("Podaj b.");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.println("Podaj c.");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();


        System.out.println("Podaj h.");
        Scanner sc4 = new Scanner(System.in);
        int h = sc4.nextInt();


        //b
        System.out.println("Kwadrat Pole:");
        System.out.println(a*a);

        System.out.println("Kwadrat Obwód:");
        System.out.println(4*a);


        System.out.println("Prostokąt Pole:");
        System.out.println(a*b);

        System.out.println("Prostokąt Obwód:");
        System.out.println(2*a+2*b);


        System.out.println("Trapez Pole:");
        System.out.println((a+b)*h / 2);

        System.out.println("Trapez Obwód:");
        System.out.println(a+b+2*c);


    }
}
