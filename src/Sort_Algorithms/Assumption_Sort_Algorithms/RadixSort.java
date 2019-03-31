package Sort_Algorithms.Assumption_Sort_Algorithms;

// Makes assumptions about the data
// Data mush have same radix and width
// Because of this, data must be integers or strings
// Sort based on each individual digit or letter position
// Start at the rightmost position
// Must use a stable algorithm at each stage

public class RadixSort
{
    public static void main(String[] args)
    {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }
}
