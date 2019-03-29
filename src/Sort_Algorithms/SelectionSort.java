package Sort_Algorithms;

// Selection Sort algorithm divides an array into sorted an
// unsorted partitions

// In-place algorithm (Does not use any extra memory)
// O(n^2) time complexity - quadratic
// It will take 100 steps to sort 10 items and so on
// Does not require as much swapping as Bubble Sort
// Unstable sort algorithm because if we have duplicate elements, there
// is no guarantee that their original order relative to each other will
// be preserved because on each pass, we swapped the largest element with
// with whatever is occupying the last position in the unsorted partition

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++)
            {
                if(intArray[i] > intArray[largest])
                {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
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
