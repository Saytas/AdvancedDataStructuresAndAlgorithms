package Sort_Algorithms.Sort_Algorithms_Challenge_3;

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
        String[] radixStringsArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // Radix of 26 because there are 26 letters in the alphabet
        // Each of our strings have 5 letters so the width is 5
        radixSort(radixStringsArray, 26, 5);

        for(int i = 0; i < radixStringsArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + radixStringsArray[i]);
        }
    }

    // radixSort()
    public static void radixSort(String[] input, int radix, int width)
    {
        // We are calling radixSingleSort() for each position in our values
        // we have width of 5
        for(int i = width -1; i >= 0; i--)
        {
            radixSingleSort(input, i, radix);
        }
    }

    // radixSingleSort()
    public static void radixSingleSort(String[] input, int position, int radix)
    {
        int numItems = input.length;

        // radix will be 5 - digits from 0 to 4
        int[] countArray = new int[radix];

        for(String value : input)
        {
            countArray[getLetterIndex(position, value)]++;
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
        String[] temp = new String[numItems];

        // Starting at the end
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
        {
            temp[--countArray[getLetterIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        // Copy from tempArray into input array
        // We can use System.arraycopy();
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++)
        {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getLetterIndex(int position, String value)
    {
        // Call the charAt() method
        // We want to return where f is being counted in the counting array
        // So to get the position of f, we need to subtract from position of a
        // If we want to get the position in the count array, we need to translate
        // later into the indices zero to 25
        // Translate the numeric value for character into an index in the counting array
        return value.charAt(position) - 'a';
    }
}