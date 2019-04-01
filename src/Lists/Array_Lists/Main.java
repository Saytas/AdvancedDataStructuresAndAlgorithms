package Lists.Array_Lists;

import java.util.ArrayList;
import java.util.List;

// ArrayList is good for random access and good for iterating of the items
// in the list if you have an index, but it is not so good for inserting items
// into the list in any position other than the end; it is not good for deletions,
// removals, and accessing an item in the list when you do not have its index (Backed by an array)

public class Main
{
    public static void main(String[] args) {
        // Using List<> if we decide later that we want to use a different
        // type of list, it is easy to change the specific implementation
        // of the list that we are using
        List<Employee> employeeList = new ArrayList<>(); // LinkedList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Marry", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // Lambda expression
        // forEach employee in the lis, we are going to print that employe out instead of a loop
        employeeList.forEach(employee -> System.out.println(employee));

        // Get the second employee in the list - just like with arrays,
        // the index is 0 based when we are working with array lists.
        // This is done in constant time because an array is backing the list
        // random access like this. where we just provide an index is done in constant
        // time. The time complexity does not depend on the size of the list
        // ArrayList is great when you want to load a bunch of data and the access it like this
        System.out.println("\nSecond Employee: " + employeeList.get(1));

        // Check if the list is empty
        System.out.println("\nIs the list empty: " + employeeList.isEmpty());

        // Replace an employee at a specific position with another employee
        System.out.println("\nNew List:");
        employeeList.set(1, new Employee("John", "Adams",4568));
        employeeList.forEach(employee -> System.out.println(employee));

        // If you want to add an employee to the list or add an item to the list it is always
        // added to the end of the list if you use the add() method
        // If you want to replace an item in the list, you use the set() method
        // Now because random access is O(1) setting, an employee will happen in Constant time complexity
        // As long as you are providing an index whatever operation you are performing will perform
        // with a time complexity of Constant time over the one

        // To get the number of items in the list
        System.out.println("\nThe size of the list: " + employeeList.size());

        // To add an item at a specific position
        // Since some values need to be shifted up to stick this employee in the middle,
        // so the worst case for this is O(n) Linear time complexity
        System.out.println("\nAdding a new employee at index 3:");
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        // To get the backing array that is holding the employees
        // We will get an object array
        // If we want an employee array, we can get it, but we have to tell the compiler
        // that that is what we want. To do that, we pass an array of the type we want
        // Instead of calling toArray() method and not passing anything we would change this call
        // to say new Employee[employeeList.size()] and the length that we want is employeeList.size()
        System.out.println("\nGetting an array of employees:");
        //Object[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee employee : employeeArray) // Object employee : employeeArray
        {
            System.out.println(employee);
        }

        // To check if the list contains an instance, we can call the contains() method
        // to check whether the list contains an employee
        // The reason we get false is because we have not implemented the equals() method in Employee class
        // so because there is no equals() method, what does this method is doing is actually checking to see
        // if they are the exact same instance because that is what the default equals method does the one all
        // the way back in object and they are not the same exact instance
        System.out.println("\nChecking whether the list contains an employee: ");
        System.out.println(employeeList.contains(new Employee("Marry", "Smith", 22)));

        // We can make use of the indexOf() method
        // This will look up an employee in the list and tell us what index that
        // employee is occupying
        System.out.println("\nLooking up for the index position of an employee in the list: ");
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        // To remove items from the list
        System.out.println("\nRemoving the employee Marry: ");
        employeeList.remove(2); // We can also pass an instance of, but this is faster because of providing an index
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
