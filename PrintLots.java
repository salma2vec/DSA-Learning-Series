/*
You are given a linked list, L, and another linked list, P,
containing integers sorted in ascending order. The operation PrintLots(L, P) will print
elements in L that are in positions specified by P. For instance, if P = 1, 3, 4, 6, the first,
third, fourth, and sixth elements in L are printed. Write the procedure PrintLots(L, P).
You should use only the basic list operations.
*/
//Solution.

void PrintLots( List L, List P )
{
Position L_pos, P_pos;
int Counter = 1;
L_pos = L->Next; // Let L_pos point to the first element of L
P_pos = P->Next; // Let P_pos point to the first element of P
while ( L_pos != NULL && P_pos != NULL )
{
if ( P_pos-> Element == Counter)
{
Print( L_pos->Element) ;
P_pos = P_pos->Next;
}
L_pos = L_pos->Next;
Counter++;
}
}

// What is the running time of your procedure?
/* 
By assuming the length of L is l and the length of P is p, we get the running time of the above procedure to be O(l + p).
*/
