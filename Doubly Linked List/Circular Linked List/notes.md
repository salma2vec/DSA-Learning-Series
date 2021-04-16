## Algorithm to insert a new node in the beginning of the circular doubly linked list
- Step 1: Create New_node
- Step 2: SET New_Node->DATA = VAL
- Step 3: SET START->PREV->NEXT = new_node;
- Step 4: SET New_Node->PREV = START->PREV;
- Step 5: SET START->PREV= new_Node;
- Step 6: SET new_node->next = START;
- Step 7: SET START = New_Node
- Step 8: EXIT


## Algorithm to insert a new node at the end of the circular doubly linked list
- Step 1: Create New_node
- Step 2: SET New_Node->DATA = VAL
- Step 3: SET New_Node->Next = START
- Step 4: SET New_Node->PREV = START->PREV
- Step 5: SET START->PREV->Next = New_Node
- Step 6: SET START->PREV = New_Node
- Step 7: EXIT


## Algorithm to insert a new node after a node that has value NUM
- Step 1: Create New_node
- Step 2: SET New_Node->DATA = VAL
- Step 3: SET PTR = START
- Step 4: Repeat Step 5 while PTR->DATA != NUM
- Step 5: SET PTR = PTR->NEXT
[END OF LOOP]
- Step 6: New_Node->NEXT = PTR->NEXT
- Step 7: SET PTR->NEXT->PREV = New_Node
- Step 8: SET New_Node->PREV = PTR
- Step 9: SET PTR->NEXT = New_Node
- Step 10: EXIT


## Algorithm to delete the first node from the circular doubly linked list
- Step 1: IF START = NULL, then

Write UNDERFLOW

Go to Step 8
[END OF IF]

- Step 2: SET PTR = START
- Step 3: SET PTR->PREV=>NEXT= PTR->NEXT
- Step 4: SET PTR->NEXT->PREV = PTR->PREV
- Step 5: SET START = START->NEXT
- Step 6: FREE PTR
- Step 7: EXIT


## Algorithm to delete the last node of the circular doubly linked list
-Step 1: IF START = NULL, then

Write UNDERFLOW

Go to Step 8
[END OF IF]

- Step 2: SET PTR = START->PREV
- Step 3: SET PTR->PREV->NEXT = START
- Step 4: SET START->PREV = PTR->PREV
- Step 5: FREE PTR
- Step 6: EXIT


## Algorithm to delete the node after a given node from the circular doubly linked list
- Step 1: IF START = NULL, then
- 
Write UNDERFLOW

Go to Step 9
[END OF IF]

- Step 2: SET PTR = START
- Step 3: Repeat Step 4 while PTR->DATA != NUM
- Step 4: SET PTR = PTR->NEXT
[END OF LOOP]

- Step 5: SET TEMP = PTR->NEXT
- Step 6: SET PTR->NEXT = TEMP->NEXT
- Step 7: SET TEMP->NEXT->PREV = PTR
- Step 8: FREE TEMP
- Step 9: EXIT
