package Queues.Queues_Array_Implementation;

import java.util.NoSuchElementException;

public class ArrayQueue
{
    private Employee[] queue;
    // Track front of the Queue
    private int front;
    // Track back of the Queue
    private int back;

    public ArrayQueue(int capacity)
    {
        queue = new Employee[capacity];
    }

    public void add(Employee employee)
    {
        // Check to see whether the Queue is full
        if(back == queue.length)
        {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove()
    {
        if(size() == 0)
        {
            throw new NoSuchElementException();
        }

        Employee removedEmployee = queue[front];
        queue[front] = null;
        front++;

        // Resetting the Queue
        if(size() == 0)
        {
            front = 0;
            back = 0;
        }

        return removedEmployee;
    }

    public Employee peek()
    {
        if(size() == 0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size()
    {
        return back - front;
    }

    public void printQueue()
    {
        for(int i = front; i < back; i++)
        {
            System.out.println("Queue: " + queue[i]);
        }
    }
}
