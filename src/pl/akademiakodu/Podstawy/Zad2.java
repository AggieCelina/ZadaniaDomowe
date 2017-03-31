package pl.akademiakodu.Podstawy;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad2 {

    public static void main(String[] args){

        int a = 100;
        int b = 12;


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
