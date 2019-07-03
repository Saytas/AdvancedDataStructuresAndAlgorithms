package Sort_Algorithms;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        // Declare set
        int S[] = { 2, 6, 8, 5, 1, 10 };
        int D, setNumber = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter D value: ");
        D = sc.nextInt();

        // logic to find 2 digit set
        for(int i = 0; i < S.length; i++)
        {
            for (int j = i + 1; j < S.length; j++)
            {
                if((S[i] + S[j]) == D)
                {
                    System.out.println("S"+(++setNumber)+"= {" + S[i] + "," + S[j] + "}");
                }

            }
        }

        // logic to find 3 digit set
        for (int i = 0; i < S.length; i++)
        {
            for (int j = i + 1; j < S.length; j++)
            {
                for (int k = j + 1; k < S.length; k++)
                {
                    if ((S[i] + S[j] + S[k]) == D)
                    {
                        System.out.println("S"+(++setNumber)+"= {" + S[i] + "," + S[j] + ","+ S[k] + "}");
                    }
                }
            }
        }

        if(setNumber==0)
        {
            System.out.println("Solution subset does not exist");
        }
    }
}
