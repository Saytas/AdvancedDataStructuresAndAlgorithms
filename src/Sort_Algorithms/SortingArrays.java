package Sort_Algorithms;

import java.util.Arrays;

public class SortingArrays
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //Arrays.sort(intArray);

        // Uses thread that is why it is called parallelSort()
        // This sort might be faster for larger data sets
        // If you want to sort an array of objects, then you will
        // have to implement the comparable interface so that the
        // method knows how it is supposed to order your object
        // when it is doing the sort
        Arrays.parallelSort(intArray);

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }
}
