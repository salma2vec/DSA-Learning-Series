## Merge Sort
Merge(A, left, middle, right)
1.  n1← middle – left + 1
2.  n2← right – middle
3.  create array L[n1], R[n2]
4.  for i ← 0 to n1-1 do L[i] ← A[left +i]
5.  for j ← 0 to n2-1 do R[j] ← A[middle+j]
6.  k ← i ← j ← 0
7.  while i < n1 &  j < n2
8. if L[i] < R[j]
9. A[k++] ← L[i++]
10.    else
11.A[k++] ← R[j++]
12. while i < n1
13.  A[k++] ← L[i++]
14. while j < n2
15.  A[k++] ← R[j++]
