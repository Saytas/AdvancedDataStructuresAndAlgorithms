package Stacks.Stacks_Array_Implementation;

// The worst case for pushing onto a stack is Linear Time O(n)

import java.util.EmptyStackException;

public class ArrayStack
{
    // Field for the array that is going to be used to back the Stack
    private Employee[] stack;
    // Need to track the index of the top position on the stack
    private int top;

    public ArrayStack(int capacity)
    {
        // We want the caller tell us the capacity of the stack
        // Capacity will be the maximum number of items we can store on the stack
        stack = new Employee[capacity];
    }

    public void push(Employee employee)
    {
        // Check whether the stack is full
        if(top == stack.length)
        {
            // Need to resize the backing array
            // This push() method's time complexity is O(n) - Linear Time Complexity
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        // O(1) - Constant Time Complexity
        stack[top++] = employee;
    }

    // If we do not worry about resizing the array, the pop() operation
    // is always done in Constant Time Complexity O(1) because it does not depend
    // on the number of items
    // If we want to be diligent and worry about resizing the array; if there is a lof
    // of space then the pop() operation will become a Linear operation - Linear Time Complexity O(n)
    public Employee pop()
    {
        if(isEmpty())
        {
            // throw an exception; caller has to handle this
            throw new EmptyStackException();
        }

        // Use prefix operator to decrement top
        // Top always contains the index of the next
        // available position in tha array and so there is nothing at top; nothing is stored at top
        // The top item on the stack is actually stored at top - 1 (--top)
        // Decrement top and use the result as the index into stack
        Employee employee = stack[--top];

        // Because we have popped the employee at position top
        stack[top] = null;

        return employee;
    }

    public Employee peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        // Top always points to the next available position in the stack
        return stack[top - 1];
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        if(top == 0)
        {
            return true;
        }

        return false;
    }

    public void printStack()
    {
        // Printing the stack from top to bottom
        for(int i = top - 1; i >= 0; i--)
        {
            System.out.println(i + ": " + stack[i]);
        }
    }
}
