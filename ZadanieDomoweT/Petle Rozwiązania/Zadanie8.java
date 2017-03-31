package com.company;


public class Main
{

    public static void main(String[] args)
    {

        pierwsza:
        for (int i = 1; i <= 30; i++)
        {
              System.out.println("Pierwsza:" + i);

              druga:
                for (int k = 1; k <= 10; k++)
                {
                    System.out.println("Druga:" + k);

                    if(i ==15 && k ==3)
                        break pierwsza;
                }
            
        }
    }
}
