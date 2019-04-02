package Sort_Algorithms.Sort_Algorithms_Challenge_1;

// Divide and conquer algorithm
// Recursive algorithm
// Two phases: Splitting and Merging
// Splitting phase leads to faster sorting during the Merging phase
// Splitting is logical. We do not create new arrays

// Splitting phase: Preparation phase to make sorting faster during the
// merging phase
// Merging phase: Doing the sorting

// Splitting Phase (In-place):
// Start with an unsorted array
// Divide the array into two arrays, which are unsorted. The first
// array is the left array, and the second array is the right array
// Split the left and right arrays into two arrays each
// Keep splitting until all the arrays have only one element each -
// these arrays are sorted

// Merging Phase (Not-in place):
// Merge every left/right pair of sibling array into a sorted array
// After the first merge, we will have a bunch of 2-element sorted arrays
// Then merge those sorted arrays (left/right siblings) to end up with
// with a bunch of 4 element sorted array
// Not-in place, uses temporary arrays

// Merging Process:
// We merge sibling left and right arrays
// We create a temporary array large enough to hold all the elements
// in the arrays we are merging
// We set i to the first index of the left array, and j to the first
// index of the right array
// We compare left[i] to right[j]. If left is smaller, we copy it to the
// temp array and increment it by 1. If right is smaller, we copt it to
// the temp array and increment j by 1
// We repeat this process until all elements in the two arrays have been
// processed
// At this point, the temporary array contains the merged values in sorted order
// We then copy this temporary array back to the original input array, at the
// correct positions
// If the left array is at positions x to y, and the right array is at positions
// y + 1 to z, then after the copy, positions x to z will be sorted in the
// original array

// Merge Sort
// Not an in-place algorithm. Splitting phase is in-place, but when we do
// the merging phase we use temporary array to merge each pair of sibling arrays
// Time Complexity O(nlogn) - Base 2. We are repeatedly dividing the array in half
// during the splitting phase
// Stable Sort Algorithm because when we do the merging we check whether the element
// in the right array is greater than the element in the left array

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }

    // Merge sort implementation (Recursive method)
    // It is the method that is going to call itself recursively
    // {20, 35, -15, 7, 55, 1, -22}
    public static void mergeSort(int[] input, int start, int end)
    {
        // For recursion we need a base case - breaking condition
        if(end - start < 2)
        {
            return;
        }

        int mid = (start + end) / 2;

        // Sorting the left partition
        mergeSort(input, start, mid);

        // Sorting the right partition
        mergeSort(input, mid, end);

        // Merge the left and right partitions
        // We always merge sorted partitions
        merge(input, start, mid, end);
    }

    // Merge implementation doing the merging
    public static void merge(int[] input, int start, int mid, int end)
    {
        // Traversing in descending order

        // 1st Optimization - we actually do not need to do any merging
        // We are always merging sorted arrays. So, when we call merge the left
        // partition that we are merging is sorted and the right partition is sorted
        // If the last element in the left partition <= first element in the right partition
        // that means all the elements in the left partition are <= than the smallest element
        // in the right partition
        // If everything in the left array is smaller than everything in the right array then
        // the merge array is just going to be left array followed by the right array and so
        // none of the positions of the elements are going to change.
        if(input[mid - 1] >= input[mid])
        {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while(i < mid && j < end)
        {
            // If the sign was only > rather than >=, it would result
            // in the element in the right array being written before the
            // one in the left array and that would turn Merge Sort into an
            // unstable algorithm
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        // 2nd Optimization - handling the remaining elements in the array that we have in traverse
        // If we have elements remaining in the left partition, we have to copy them into the
        // temp array, but if we have elements remaining in the right partition, we do not have to
        // do anything. If we have elements left over in the right array that means that all of
        // the elements that are left over in the right array will be greater than everything that
        // has already been copied because we are always copying the smallest of the elements
        // If we have elements left over in the left array, then those elements are greater than everything
        // we have already written and so, obviously, we need to write those, because their positions
        // are going to change
        // First parameter: source array, Second parameter: starting position
        // Third parameter: destination, Fourth parameter: positions to copy at - destination index
        // Fifth parameter: length we are going to write

        // If there are left overs in the left array, this will copy them directly from one location
        // in the input array to another location in the input array. It will essentially jump over
        // the elements we are going to copy from the temp array and write any remaining elements
        // in the left array.
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // Copy over the temp array
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}