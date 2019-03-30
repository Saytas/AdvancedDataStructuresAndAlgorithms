package Sort_Algorithms;

// Variation of Insertion Sort
// Insertion Sort chooses which element to insert using a gap of 1
// Shell Sort starts out using a larger gap value
// As the algorithm runs, the gap is reduced
// Goal is to reduce the amount of shifting required
// As the algorithm processes, the gap is reduced
// The last gap value is always 1
// A gap value of 1 is equivalent to insertion sort
// So, the algorithm does some preliminary work (using gap
// values greater than 1), and then becomes Insertion Sort
// By the time we get to Insertion Sort, the array has been
// partially sorted, so there is less shifting required

// Knuth Sequence
// Gap is calculated using (3^k - 1) / 2
// We set k based on the length of the array
// We want the gap to be as close as possible to the length of
// the array we want to sort, without being greater than the length

// We will base our gap on the array's length. We will initialize
// the gap (or interval) to array.length / 2
// On each iteration, we will divide the gap value by 2 to get the
// next gap value
// For our array, the gap will be initialized to 3
// On the next iteration, it will be 1 - Insertion Sort

// In-place algorithm (Does not need to create temporary arrays
// as long as the extra memory we are using does not depend on the
// number of items we are sorting - working within the original array)
// Difficult to nail down the time complexity because it will depend on
// the gap. Worst case: O(n^2), but it can perform much better than that
// Does not require as much shifting as Insertion Sort, so it usually
// performs better
// Unstable algorithm. In the pre-insertion sort phase, when we are
// comparing elements that are far away from each other, it is very
// possible that if we have a duplicate element, the rightmost element
// will be shifted in front of the leftmost element
// The relative positions of duplicate items will not be preserved

public class ShellSort
{
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // We need a gap of 1 for the final iteration. In Shell Sort, final
        // iteration has to be 1, because we want the final iteration to essentially
        // be Insertion Sort
        for(int gap = intArray.length / 2; gap > 0; gap /= 2)
        {
            for(int i = gap; i < intArray.length; i++)
            {
                // The value we are going to be looking at
                int newElement = intArray[i];

                // To do traversing
                int j = i;

                while(j >= gap && intArray[j - gap] > newElement)
                {
                    intArray[j] = intArray[j - gap];
                    j-=gap;
                }

                // E.g. pos 3 is set equal to position 0
                intArray[j] = newElement;
            }
        }

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println("i[" + i + "] = " + intArray[i]);
        }
    }
}
