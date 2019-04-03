package Stacks.Stacks_LinkedList_Implementation;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

// Stack backed by a LinkedList
// This class behaves like a Stack, and we can only with the last item that was added

public class LinkedStack
{
    // This LinkedList is actually a doubly LinkedList and for a Stack
    // we do not need a doubly LinkedList because we are always working
    // with the item that is at the front of the list
    private LinkedList<Employee> stack;

    public LinkedStack()
    {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee)
    {
        // LinkedList class in the JDK implements the Deque interface, so it has
        // push(), pop(), and peek() methods
        stack.push(employee);
    }

    public Employee pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack.pop();
    }

    public Employee peek()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void printStack()
    {
        // The iterator traverses the list from head to tail and in a
        // LinkedList implementation of a stack, the top item is always at the head
        // Printing from the top down
        ListIterator<Employee> iterator = stack.listIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
