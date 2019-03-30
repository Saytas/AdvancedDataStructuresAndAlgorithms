package Sort_Algorithms;

// Factorial Algorithm
// If num is equal to 0, the factorial is 1. Stpo. We have the result.
// Otherwise:
// Set multiplier to 1
// Set factorial to 1
// While multiplier is not equal to num, do steps 5 and 6
// Multiply factorial by multiplier ang assign the result to factorial
// Add 1 to multiplier
// Stop. The result is factorial

// A method is a recursive method when it calls itself
// 0 factorial is equal to 1 - Factorial for negative numbers are undefined

public class Recursion
{
    public static void main(String[] args)
    {
        int itrFactorial = iterativeFactorial(3);
        System.out.println("Iterative call: " + itrFactorial);
        //System.out.println(iterativeFactorial(3));

        int recurFactorial = recursiveFactorial(3);
        System.out.println("Recursive call: " + recurFactorial);
    }

    // Recursion method is the most elegant and more easier to
    // understand solution

    // n! = n * (n - 1)!
    // Gets push on the the stack
    // recursiveFactorial(0) = 1
    // recursiveFactorial(1)
    // recursiveFactorial(2)
    // recursiveFactorial(3)

    // If there is no base case in a recursive call, the method will
    // keep calling itself recursively and eventually you will get a
    // stack overflow exception because the call stack (recursion stack)
    // only has a certain amount of memory allocated to it. And so, eventually,
    // you will blow that memory
    public static int recursiveFactorial(int num)
    {
        // Base case - Breaking condition
        // that is going to end the recursion
        if(num == 0)
        {
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }

    // Iterative implementation usually runs faster and does not use
    // as much memory because there is overhead involved pushing method
    // calls on to the call stack and each stack frame uses some memory
    // To calculate the factorial in an iterative fashion
    // that means we are not going to use recursion
    public static int iterativeFactorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }

        int factorial = 1;

        for(int i = 1; i <= num; i++)
        {
            factorial *= i;
            //System.out.println(factorial);
        }

        return factorial;
    }
}
