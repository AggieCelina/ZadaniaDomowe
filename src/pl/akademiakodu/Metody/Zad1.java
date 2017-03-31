package pl.akademiakodu.Metody;

/**
 * Created by aggiecelina on 17.03.17.
 */
public class Zad1 {

    public static void main(String[] args){

        int a = 1;
        int b = 2;
        int c = -15;
        int h = 15;

        System.out.println("sum: " + sumNumbers(a,b));
        System.out.println("sub: " + substractNumbers(a,b));
        System.out.println("div: " + divideNumbers(a,b));
        findRoots(a,b,c);
        rectangleCalc(a,b);
        squareCalc(a);
        trapezeCalc(a,b,h);
        triangleCalc(a,b);



    }

    static int sumNumbers(int a, int b){

        int sum = a + b;
        return sum;
    }

    static int substractNumbers(int a, int b){

        int sub = a - b;
        return sub;
    }

    static double divideNumbers(int a, int b){

        double div = 0.;

        if(b!=0) {
            div = (double) a / (double) b;
        }
        else{
            System.out.println("nie dziel przez 0");
        }

        return div;
    }

    static void findRoots(int a, int b, int c){

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

    static void squareCalc(int a){
        System.out.println("\nsquare" + "\nfield: " + (a*a) + "\ncir: " + (4*a));

    }

    static void rectangleCalc(int a, int b){

        System.out.println("\nrectangle" + "\nfield: " + (a*b) + "\ncir: " + (2*a + 2*b));

    }

    static void trapezeCalc(int a, int b, int h){

        double sideOfTrapeze = Math.sqrt(((b-a)/2)^2 + h^2);
        System.out.println("\ntrapeze" + "\nfield: " + ((a+b)/2*h) + "\ncir: " + (a+b+2*sideOfTrapeze));
    }

    static void triangleCalc(int a, int h){

        System.out.println("\ntriangle" + "\nfield " + ((a*h)/2) + "\ncir: " + (a+h+Math.sqrt(a*a + h*h)) );
    }
}
