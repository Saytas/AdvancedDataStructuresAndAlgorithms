package Sort_Algorithms.Assumption_Sort_Algorithms;

// Stable Counting Sort
// Requires extra steps
// Can calculate where values should be written back to the original array
// Writing the values into the array in backwards order ensures stability

// This works because we traverse the input array from right to left, and
// we write duplicate values into the temp array from right to left
// If we know that duplicate values will go into positions 3 and 4, we write
// the rightmost value in the input array into position 4, and the leftmost
// value into position 3
// This preserves the relative positioning of the duplicate values
// By adjusting the counting array after the initial pass, we can map
// values to indices in the temp array
// Can also use linked lists to make counting sort stable

public class StableCountingSort
{
    public static void main(String[] args)
    {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(intArray, 10, 4);

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
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
