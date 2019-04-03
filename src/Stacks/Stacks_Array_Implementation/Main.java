package Stacks.Stacks_Array_Implementation;

public class Main
{
    public static void main(String[] args)
    {
        // Implementing a stack using an array (Backed by an array)
        // Arrays are great for random access
        // You can only ever work with top item in Stacks because it is LIFO (last in, first out)
        // Arrays are commonly used to back stack implementations

        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jane", "Jones",123));
        stack.push(new Employee("John", "Doe",4567));
        stack.push(new Employee("Marry", "Smith",22));
        stack.push(new Employee("Mike", "Wilson",3245));
        stack.push(new Employee("Bill", "End",78));

        // Printing from top down, we see these in reverse order
        stack.printStack();

        System.out.println("\n");
        System.out.println(stack.peek());

        System.out.println("\n");
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
