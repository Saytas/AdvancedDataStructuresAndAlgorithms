package Sort_Algorithms;

// Least efficient algorithm

// In-place algorithm (Does not use any extra memory)
// It is okay to use a few extra fields as long as the extra memory you
// are using does not depend the number of items you are sorting, it is
// an in-place algorithm

// Time complexity of Bubble Sort is O(n^2); it is quadratic
// So the absolute worse case is it will take n^2 steps where
// n is the number of items we are sorting

// This is a quadratic algorithm (Quadratic time complexity)

// When deciding the time complexity, look how many loops there are
// because normally each loop corresponds to n

// One loop : Linear time complexity
// Two loops : Quadratic time complexity (n*n)

// Stable v.s. Unstable algorithms
// Bubble Sort is a stable algorithm because when comparing adjacent elements,
// we only swap them if the element at i is greater than the element at i + 1
// If the algorithm says greater than or equals or implementation says greater or
// equals then we would swap them and that would be an unstable sort

// A stable sort algorithm preserves the relative ordering of duplicate items
// and an unstable sort algorithm does not

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            for(int i = 0; i < lastUnsortedIndex; i++)
            {
                if(intArray[i] > intArray[i + 1])
                {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }

    // It has to be static because it is going to be called from
    // the main method
    public static void swap(int[] array, int i, int j)
    {
        if(i == j)
        {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
