package Sort_Algorithms;

// In-place algorithm (Does not need to create temporary arrays
// as long as the extra memory we are using does not depend on the
// number of items we are sorting)
// O(n^2) time complexity - quadratic
// It will take 100 steps to sort 10 items and so on
// Stable sort algorithm because when we are picking off elements, we are
// doing that from left to right so if let's say there are two nines
// in the array, we are going to insert the left most nine first and
// when we come to the right most nine, remember that when we are looking
// for the insertion position, we stop when we hit an element that is less
// than or equal to the one we are inserting
// So the relative positions of those two nines will be preserved

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // This implementation starts out by assuming that the element at position
        // zero is in the sorted partition and so the first unsorted index will
        // start at one
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
        {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--)
            {
                // Shifting from left to right
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }
}
