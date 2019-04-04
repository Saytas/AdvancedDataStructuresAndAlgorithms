package Lists.Linked_Lists_Challenge_1;

import java.util.Iterator;

public class EmployeeDoublyLinkedList
{
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size = 0;

    // To add a Node to the beginning of the list
    public void addToFront(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if(head == null) // isEmpty()
        {
            tail = node;
        }
        else
        {
            head.setPrevious(node);
            // OR this would work here
            //node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null) //isEmpty()
        {
            head = node;
        }
        else
        {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee)
    {
        // Return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee does not exist in the list
        if(isEmpty()) // head == null
        {
            return false;
        }

        // Find the existing employee
        EmployeeNode current = head;

        while(current != null && !current.getEmployee().equals(existingEmployee))
        {
            current = current.getNext();
        }

        // When we drop out of the loop, 2 things are possible; either current is
        // null meaning that the existing employee is not in the list so the employee
        // actually does not exist in the list, or we have found the employee that was
        // passed in as the existing employee
        if(current == null)
        {
            return false;
        }

        // At this point we have found the existing employee in the list
        // Insert new employee to the in front of the existing employee
        EmployeeNode newNode = new EmployeeNode(newEmployee);

        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);

        current.setPrevious(newNode);
        if(head == current)
        {
            head = newNode;
        }
        else
        {
            newNode.getPrevious().setNext(newNode);
        }

        size++;

        return true;
    }

    public EmployeeNode removeFromFront()
    {
        if(isEmpty())
        {
            return null;
        }

        EmployeeNode removedNode = head;

        if(head.getNext() == null)
        {
            tail = null;
        }
        else
        {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;

        // Cleaning up the reference
        removedNode.setNext(null);

        return removedNode;
    }

    public EmployeeNode removeFromEnd()
    {
        if(isEmpty())
        {
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null)
        {
            head = null;
        }
        else
        {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;

        // Cleaning up the reference
        removedNode.setPrevious(null);

        return removedNode;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void printList()
    {
        EmployeeNode current = head;
        System.out.print("HEAD <=> ");
        while(current != null)
        {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}