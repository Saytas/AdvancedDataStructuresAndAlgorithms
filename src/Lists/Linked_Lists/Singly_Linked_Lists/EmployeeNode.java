package Lists.Linked_Lists.Singly_Linked_Lists;

public class EmployeeNode
{
    private Employee employee;
    private EmployeeNode next;

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

    public String toString()
    {
        return employee.toString();
    }
}