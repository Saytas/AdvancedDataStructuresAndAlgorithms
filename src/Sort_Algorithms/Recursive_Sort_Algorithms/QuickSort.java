package Sort_Algorithms.Recursive_Sort_Algorithms;

// Divide and conquer algorithm
// Recursive algorithm
// In-place algorithm it takes place within the array (advantage over Merge Sort)
// Time Complexity O(nlogn) - base 2. We are repeatedly
// partitioning the array into two halves
// Unstable algorithm
// Uses a pivot element to partition the array into two parts
// Elements < pivot to its left, elements > pivot to its right
// Pivot will then be in its correct sorted position
// Process is now repeated for the left array and right array
// Eventually, every element has been the pivot, so every element
// will be in its correct sorted position
// As with merge sort, we will end up partitioning the array into
// a series of 1-element arrays
// Does this in-place (unlike merge sort) so we do not have to create
// any temporary arrays and we do not need a lot of memory to do sort

// Partitioning step

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }

    // quickSort() method
    public static void quickSort(int[] input, int start, int end)
    {
        if(end - start < 2)
        {
            return;
        }

        // We have put the pivot into its correct sorted position
        // and repositioned the elements such as everything to the left
        // of the pivot is smaller than the pivot and everything to the
        // right of the pivot is greater than the pivot
        int pivotIndex = partition(input, start, end);

        // Quick sorting the left subarray
        quickSort(input, start, pivotIndex);

        // Quick sorting the right subarray
        quickSort(input, pivotIndex + 1, end);
    }

    // partition() method
    public static int partition(int[] input, int start, int end)
    {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        // i is going to traverse from left to right and
        // j is going to be traversing from right to left
        // and we want to stop when i and j cross each other
        while(i < j)
        {
            // Note: Empty loop body
            // Moving/traversing from right to left - looking for a value that is less than the pivot
            while(i < j && input[--j] >= pivot);
            if(i < j)
            {
                input[i] = input[j];
            }

            // Note: Empty loop body
            // Moving/traversing from left to right - looking for a value that is greater than the pivot
            while(i < j && input[++i] <= pivot);
            if(i < j)
            {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
