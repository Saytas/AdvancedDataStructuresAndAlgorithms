package Lists.Linked_Lists.Doubly_Linked_List;

public class Main
{
    public static void main(String[] args)
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        System.out.println(list.getSize());
        list.printList();
        System.out.println("\n");

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        System.out.println(list.getSize());
        list.printList();
        System.out.println("\n");

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
        System.out.println("\n");

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();
        System.out.println("\n");
    }
}
