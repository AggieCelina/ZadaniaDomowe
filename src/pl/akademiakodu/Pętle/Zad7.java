package pl.akademiakodu.Pętle;

import java.util.Scanner;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad7 {
    public static void main(String[] args){
        //tower

        System.out.println("podaj długość wieży/choinki");
        Scanner scanner = new Scanner(System.in);
        String tower = "*";
        int imageLength = scanner.nextInt();

        for (int i=1;i<=imageLength;i++){
            System.out.println(tower);
            tower = tower + "*";
        }

//tree

        for (int i=0;i<imageLength;i++){


            String tree = "*";
            for(int j=0;j<=((imageLength+1)/2 - i);j++) {
                tree =  " " + tree;
            }


            for (int j = 1; j <= i* 2; j++) {
                    tree = tree + "*";
            }

            System.out.println(tree);


        }


    }
}
