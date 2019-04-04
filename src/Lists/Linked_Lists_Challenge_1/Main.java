package Lists.Linked_Lists_Challenge_1;

public class Main
{
    public static void main(String[] args)
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        System.out.println("\n");
        list.addBefore(billEnd, johnDoe);
        list.printList();

        System.out.println("\n");
        // Special case of the existing employee being the head of the list
        list.addBefore(new Employee("Someone","Else",111), mikeWilson);
        list.printList();
    }
}
