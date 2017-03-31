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

        System.out.println("Twoje równanie to");
        System.out.print(a);
        System.out.print("x^2+");
        System.out.print(b);
        System.out.print("x+");
        System.out.println(c);


        double delta = b*b - 4*a*c;
        if (delta < 0)
        {
            System.out.println("nie ma pierwiastkow");
        }
        else if (delta==0)
        {
            System.out.println("x1:");
            System.out.println((-b) / (2 * a));
        }
        else if (delta > 0)
        {

            System.out.println("x1:");
            System.out.println((-b+Math.sqrt(delta)) / (2*a));

            System.out.println("x2:");
            System.out.println((-b-Math.sqrt(delta)) / (2*a));
        }
        //b



    }
}
