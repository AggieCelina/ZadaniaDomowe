package pl.akademiakodu.Pętle;

import java.util.Scanner;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę ");
        int sum = scanner.nextInt();

        while (sum<30){
            System.out.println("podaj kolejną liczbę ");
            int secondDigit = scanner.nextInt();
            sum = sum + secondDigit;
        }
        System.out.println("OK " + sum);

    }
}
