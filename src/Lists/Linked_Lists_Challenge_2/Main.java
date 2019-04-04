package Lists.Linked_Lists_Challenge_2;

public class Main
{
    public static void main(String[] args)
    {
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();

        list.insertSorted(three);
        list.printList();
        System.out.println("\n");

        list.insertSorted(two);
        list.printList();
        System.out.println("\n");

        list.insertSorted(one);
        list.printList();
        System.out.println("\n");

        list.insertSorted(four);
        list.printList();
        System.out.println("\n");
    }
}
