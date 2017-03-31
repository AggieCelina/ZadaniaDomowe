package pl.akademiakodu.Podstawy;

import java.util.Scanner;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("plus: " + (a+b) + "\nminus: " + (a-b) + "\nmultiply: " + (a*b) + "\nmodulo: " + (a%b));

        if(b!=0){
            System.out.println("division: " + a/b);
        }

        if(a>b){
            System.out.println("Greater is " + a);
        }else{
            System.out.println("Greater is " + b);
        }



    }
}


