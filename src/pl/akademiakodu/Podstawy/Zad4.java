package pl.akademiakodu.Podstawy;

import java.util.Scanner;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        double sideOfTrapeze = Math.sqrt(((b-a)/2)^2 + h^2);

        System.out.println("square" + "\nfield: " + (a*a) + "\ncir: " + (4*a));
        System.out.println("\nrectangle" + "\nfield: " + (a*b) + "\ncir: " + (2*a + 2*b));
        System.out.println("\ntrapeze" + "\nfield: " + ((a+b)/2*h) + "\ncir: " + (a+b+2*sideOfTrapeze));



    }
}
