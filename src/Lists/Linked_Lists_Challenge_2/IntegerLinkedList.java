package Lists.Linked_Lists_Challenge_2;

public class IntegerLinkedList
{
    private IntegerNode head;
    private int size;

    public void addToFront(Integer value)
    {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront()
    {
        if(isEmpty())
        {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value)
    {
        // The assumption we are making here is the list is sorted
        if(isEmpty() || head.getValue() >= value) // head == null
        {
            addToFront(value);
            return;
        }

        // Find the insertion point
        // We are going to have 2 fields; one for traversing the list
        // ond then another field that is going to be one position behind
        // the current field
        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while(current != null && current.getValue() < value)
        {
            // We are constantly keeping previous one back from
            // where current is
            previous = current;
            current = current.getNext();
        }

        // When we drop out of the loop there are 2 possibilities;
        // current is null, or current is not null meaning that we
        // hit a node with a value that is greater than or equal to
        // the value we want to insert
        IntegerNode newNode = new IntegerNode(value);

        newNode.setNext(current);
        previous.setNext(newNode);

        size++;
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
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while(current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
