
- Instead of dictation how we store the items, Stacks dictate what operations we can
  do on the items

- Stack is known as an abstract data type

- A Stack is a perfect data structure to use for the call stack

Stack

- Abstract data type
- LIFO        : Last in, first out // İlk giren ilk çıkar
    - The last object, item, or element you add to a stack is always
      the first element that you can remove from the Stack that is known
      as LIFO. That means there is no random-access
      The item at the top of the stack is the only item that we are
      allowed to access, look at, and remove

- push()      : adds an item as the top item on the stack
- pop()       : removes the top item on the stack
- peek()      : gets the top item on the stack without popping it
                Allows us to access the item, but we leave it on the stack

- Ideal backing data structure : LinkedList

Stack:

When the stack is empty, top : null

push("Mary")              : Mary - top
push("John")              : Jane - top
push("Jane")              : Jane - bottom



Time Complexity

- O(1) Constant Time Complexity for push, pop, and peek, when using a LinkedList
- If you use an array, then push is O(n) Linear Time Complexity, because the array
  may have to be resized
- If you know the maximum number of items that will ever be on the stack, an array
  can be a good choice
- If memory is tight, an array might be a good choice
- LinkedList is ideal
