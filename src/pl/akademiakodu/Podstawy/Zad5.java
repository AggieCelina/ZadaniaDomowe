package pl.akademiakodu.Podstawy;

import java.util.Scanner;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = b*b - 4*a*c;
        System.out.println("delta:" + delta);
        if(delta> 0.0) {
            double sqrootDelta = Math.sqrt(delta);
            double x1 = (double)(b + sqrootDelta)/(2*a);
            double x2 = (double)(b - sqrootDelta)/(2*a);
            System.out.println("x1: " + x1 + "\nx2: " + x2);
        }
        if(delta == 0.0){
            double x0 = (double) (b/2*a);
            System.out.println("x0: " + x0);
        }
        if(delta < 0.0){
            System.out.println("Pierwiastki to liczby zespolone");
        }


    }
}
