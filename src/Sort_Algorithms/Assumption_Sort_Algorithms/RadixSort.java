package Sort_Algorithms.Assumption_Sort_Algorithms;

// Makes assumptions about the data
// Data mush have same radix (The number of unique digits or values in the case
// of characters that a numbering system or alphabet has)and width (The number of
// digits or letters)
// Radix Sort assumes that all the values have the same radix and the same width
// Because of this, data must be integers or strings
// Sort based on each individual digit or letter position
// Start at the rightmost position
// Must use a stable algorithm at each stage

// Radix Sort
// Counting Sort is often used as the sort algorithm for Radix Sort
// must be stable Counting Sort
// Linear/Constant Time Complexity - O(n) can achieve, this because we
// are making assumptions about the data we are sorting
// Even so, if often runs slower than O(nlogn) algorithms because of the
// overhead involved
// In-place algorithm or not be in-place depends on which sort algorithm you use
// to do the sorting in each phase
// Stable algorithm

public class RadixSort
{
    public static void main(String[] args)
    {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for(int i = 0; i < radixArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + radixArray[i]);
        }
    }

    // radixSort()
    public static void radixSort(int[] input, int radix, int width)
    {
        // We are calling radixSingleSort() for each position in our values
        // we have width of 4
        for(int i = 0; i < width; i++)
        {
            // This will do the sort based on one of the positions
            // it will start with the rightmost position then move to
            // rightmost - 1 position etc.
            // Moving along the digits from the least significant digit
            // to the most significant digit from right to left
            // The values have been sorted based on the position
            radixSingleSort(input, i, radix);
        }
    }

    // radixSingleSort()
    public static void radixSingleSort(int[] input, int position, int radix)
    {
        int numItems = input.length;

        // radix will be 10 - digits from 0 to 9
        int[] countArray = new int[radix];

        for(int value : input)
        {
            countArray[getDigit(position, value, radix)]++;
        }

        // Adjust the count array
        // If j is 3, it will add up indices 0, 1, 2, and 3
        for(int j = 1; j < radix; j++)
        {
            countArray[j] += countArray[j - 1];
        }

        // Copy the values into a temporary array
        // Work from left to right so that we are preserving the relative ordering
        // of the duplicates
        int[] temp = new int[numItems];

        // Starting at the end
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
        {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        // Copy from tempArray into input array
        // We can use System.arraycopy();
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++)
        {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix)
    {
        // Math.pow() method takes the first parameter and raises it to the second parameter
        // radix = 10
        // 10^0 = 1
        // value (4725) / 1 = 4725
        // 4725 % 10 = 5
        // For position 0, we are always going to be returning what is in the 1's position
        return value / (int)Math.pow(radix, position) % radix;
    }
}
