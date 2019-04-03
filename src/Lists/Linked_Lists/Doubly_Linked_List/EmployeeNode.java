package Lists.Linked_Lists.Doubly_Linked_List;

public class EmployeeNode
{
    private Employee employee;
    // Every Node is going to have 2 references
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee employee)
    {
        this.employee = employee;
        // We do not have to set next to null in the constructor because
        // that is the default value for object fields
        //this.next = null;
    }

    public Employee getEmployee()
    {
        return employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    public EmployeeNode getNext()
    {
        return next;
    }

    public void setNext(EmployeeNode next)
    {
        this.next = next;
    }

    public EmployeeNode getPrevious()
    {
        return previous;
    }

    public void setPrevious(EmployeeNode previous)
    {
        this.previous = previous;
    }

    public String toString()
    {
        return employee.toString();
    }
}