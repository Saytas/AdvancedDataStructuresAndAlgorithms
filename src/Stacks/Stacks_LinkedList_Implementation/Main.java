package Stacks.Stacks_LinkedList_Implementation;

// Constant Time Complexity O(1) because we are always working with the
// item at the head of the list and so the steps involved do not depend
// on the number of items in the list

public class Main
{
    public static void main(String[] args)
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        // Printing from top down, we see these in reverse order
        stack.printStack();

        System.out.println("\n");
        System.out.println(stack.peek());

        System.out.println("\n");
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
