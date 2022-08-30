#include<iostream>
using namespace std;
int partition(int arr[],int x,int y)
{
	int pivot = arr[x];
	int low = x+1;
	int high = y;
	
	while(low <= high)
	{   
		while(pivot > arr[low])
		{
	     low++;
		}
		while(pivot < arr[high])
		{
			high--;
		}
		if(low <= high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
		}
	}
	int temp = arr[high];
	arr[high] = arr[x];
	arr[x] = temp;
	
	return high;
}

int quicksort(int arr[],int low,int high)
{
	if(low < high)
	{
		int p = partition(arr,low,high);
		quicksort(arr,low,p-1);
		quicksort(arr,p+1,high);
	}
}
