Each item in the list is called a node

The first item in the list is the head of the list

Items in a LinkedList know which item comes after them
that means we have to store some extra information with
each item (Storing a value and a reference to the next value
in the list)

When it comes to a LinkedList, you always insert a new element
at the front of the list. We only ever store a reference to the
first element and so if we wanted to insert an item anywhere other
than the front, then we would hae to traverse the list to get there
And one of the advantages of using a LinkedList is that if you insert
items at the front of the list, you can do it in Constant Time Complexity
O(1) because the steps you have to do, do not depend on the number of
items in the list; You are always going to do the same number of steps

---INSERT---
Create the actual Node instance
Point the next field at the current head of the list
because the new Node is going to become the new head
Point the head field at the new Node
Constant Time Complexity - O(1) as long as you are inserting at the front of the list

---DELETE---
Assign the Node we want to delete to a temporary variable removedNode
Move the head to the next Node because that effectively removes the node
from the list
Then return the removedNode
Constant Time Complexity - O(1) because it does not matter how many items are in the
list. We are going to do the same number of steps

Use generics to make a class usable with a variety of object types