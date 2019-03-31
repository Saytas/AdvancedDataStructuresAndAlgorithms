package Sort_Algorithms.Assumption_Sort_Algorithms;

// Makes assumptions about the data (All the values are
// discrete within a specific range- usually used with whole numbers)
// Does not use comparisons
// Counts the number of occurrences of each value
// Only works with non-negative discrete values
// (Can not work with floats, strings, etc.)
// Values must be within a specific range

// Not an in-place algorithm
// Linear/Constant Time Complexity O(n) - Can achieve this because we are making
// assumptions about the data we are sorting
// Unstable algorithm - If we want the sort to be stable, we have to do some extra steps
// Counting Sort works best when the range of values you can have, the number
// values in that range is roughly equivalent to the number of values that you want to sort
// Use only the range of values reasonable meaning it is not too large and the data size
// is a reasonable size as well

// Traversing Phase
// Traverse the input array and count how many of each value we have

// Writing Values Back Phase
// Using the counting array we write values back into the input array

public class CountingSort
{
    public static void main(String[] args)
    {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }

    // Counting Phase
    public static void countingSort(int[] input, int min, int max)
    {
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++)
        {
            // Index of where to count each value
            // To figure out which element to count in the countArray
            // Translating the value we want to count into its index in the count array
            countArray[input[i] - min]++;
        }

        // Write values back into the input array
        // j is the index we are going to use to write to the input[] array
        // i is the index we are going to use to traverse the countArray[]
        int j = 0;
        for(int i = min; i <= max; i++)
        {
            while(countArray[i - min] > 0)
            {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
