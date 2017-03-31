package pl.akademiakodu.Pętle;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad8 {
    public static void main(String[] args){

        outerLoop:
        for(int i=10;i<=30;i++){
            for(int j = 1; j<=10; j++){
                if(i==15&&j==3){
                    break outerLoop;
                }
                System.out.println("j " + j);
            }
            System.out.println("i " + i);
        }
    }
}
