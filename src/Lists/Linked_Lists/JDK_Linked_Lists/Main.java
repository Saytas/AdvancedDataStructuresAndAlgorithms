package Lists.Linked_Lists.JDK_Linked_Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        // Iterator
        //ListIterator<Employee> iterator = list.listIterator();
        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext())
        {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        System.out.println("\n");
        for(Employee employee : list)
        {
            System.out.println(employee);
        }



        System.out.println("\n");
        // Adds an item to the end of the list; adds at the tail
        //list.add(billEnd);
        list.addLast(billEnd);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext())
        {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");



        System.out.println("\n");
        // Removes the first item
        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext())
        {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");



        System.out.println("\n");
        // Removes the last item
        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext())
        {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");
    }
}
