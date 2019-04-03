Double LinkedList

Each item in the list has next and previous fields
    - For the first item in the list, the previous field will point to null
    - For the last item in the list, the next field will point to null

The list has references to the head and the tail

- If we want to insert or remove a node from th end of the list, we can
  do it in Constant Time O(1) because we have a pointer or a reference to
  the tail of the list


INSERT AT HEAD

- Create a new Node
- Set it to whatever is currently being pointed to by head
- Previous field is going to point to whatever old head's previous field is
  we are always inserting at the head , that would mean the new node's previous
  field is going to point to null
- Old Node's previous field is going to point to the new Node
- Then assign the head field to the new Node that is at the front of the list
- O(1) Constant Time Complexity

INSERT AT TAIL

- Create a new Node
- Assign the current tail's next field to the new Node's next field
- We are going to assign whatever the current tail to new Node's previous field we want
  to point the previous field to the current (old) tail
- Then assign the current (old) tail's next field to new Node
- Finally, assignt the tail to the new Node
- O(1) Constant Time Complexity

DELETE FROM HEAD

- Assign the head to removedNode
- Assign next node's previous field to head's previous field which is null
- Assign head to the head's next field (head.getNext())
- Return removedNode from the method
- O(1) Constant Time Complexity

DELETE FROM TAIL

- Assign the tail to removedNode
- Assign previous node's next field to tail's next field which is  null
- Assign tail to the tail's previous node - current tail will be moved to
  the current tail's previous node
- Return removedNode from the method
- O(1) Constant Time Complexity


In general, to insert a Node A between Nodes B and C

- Assign A's next field to B's next field
- Assign A's previous field to C's previous field
- Assign B's next field to A
- Assign C's previous field to A
- O(1) Constant Time Complexity, but we have to find the insertion
  position first, so this is actually O(n) Linear Time Complexity

In general, to remove a Node A from between Nodes B and C

- Assign A to removedNode
- Assign C's previous field to A's previous field (B)
- Assign B's next field to A's next field (C)
- Return A from the method
- O(1) Constant Time Complexity, but we have to find the A first
  so this is actually O(n) Linear Time Complexity