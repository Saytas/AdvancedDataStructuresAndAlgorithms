package Arrays_And_BigO_Notation;

public class BigOValuesForArrayOperations
{
    public static void main(String[] args)
    {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for(int i = 0; i < intArray.length; i++)
        {
            if(intArray[i] == 7)
            {
                index = i;
                break;
            }
            //System.out.println("i[" + i + "] = " + intArray[i]);
        }
        System.out.println("Index = " + index);

        // When we talk about retrievals, we have been talking about
        // retrievals when we know what the index is
        // Retrieval:
        // When we know the index O(1) time (Constant time complexity/fashion)
        // When we do not know the index O(n) times (Linear time complexity fashion)
        // because we have to find the item first in the worst case we
        // have to loop over the entire array

        // Essentially, if we have to loop over the array in any way in order
        // to perform an operation that is going to have a linear time complexity
        // O(n)

        // If we do not have to loop over the array because we have an index and
        // so we can just calculate the memory address of the element we want to
        // work on then that is going to have a constant time complexity
        // O(1)
    }
}
