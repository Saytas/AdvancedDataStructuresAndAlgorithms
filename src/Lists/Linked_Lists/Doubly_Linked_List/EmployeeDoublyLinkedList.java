package Lists.Linked_Lists.Doubly_Linked_List;

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