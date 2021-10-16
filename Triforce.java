import java.util.*;
import java.io.*;
import java.math.*;

class Triforce {

    public static void displaySpaces(int nbrSpaces)
    {
        for(int i = 0; i < nbrSpaces; i++)
        {
            System.out.printf(" ");
        }
    }

    public static void displayTriForce(int N)
    {
        int nbrSpaces = N * 2 - 1, nbrStars = 1;
        int nbrSpacesBis = nbrSpaces;
        for(int i = 0; i < N * 2; i++)
        {
            displaySpaces(nbrSpaces);
            if(i < N)
            {
                for(int j = 0; j < nbrStars; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                if(i == N)
                {
                    nbrStars = 1;
                }
                for(int k = 0; k < nbrStars; k++)
                {
                    System.out.print("*");
                }
                displaySpaces(nbrSpacesBis);
                for(int l = 0; l < nbrStars; l++)
                {
                    System.out.printf("*");
                }
                System.out.println();
                nbrSpacesBis = nbrSpacesBis - 2;
            }
            nbrSpaces--;
            nbrStars = nbrStars + 2;
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("N : ");
	int N = in.nextInt();
        displayTriForce(N);
        in.close();
    }
}
