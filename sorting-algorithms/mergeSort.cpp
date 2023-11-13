#include <iostream>
using namespace std;

void printArray(int *arr, int n)
{
    for (int i = 0; i < n; ++i)
        cout << arr[i] << endl;
}

void merge(int *arr, int low, int mid, int high)
{
    int temp[high + 1];
    int i = low;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= high)
    {
        if (arr[i] <= arr[j])
            temp[k++] = arr[i++];
        else
            temp[k++] = arr[j++];
    }
    while (i <= mid)
        temp[k++] = arr[i++];
    while (j <= high)
        temp[k++] = arr[j++];
    k--;
    while (k >= 0)
    {
        arr[k + low] = temp[k];
        k--;
    }
}

void mergeSort(int *arr, int low, int high)
{
    int mid;

    if (low < high)
    {
        mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

int main()
{
    int arr[] = {31, 15, 28, 99, 1, 499, 63, 471, 3, 2325};
    int n = sizeof(arr)/sizeof(arr[0]);

    cout << "Before Merge Sort: " << endl;
    printArray(arr, n);

    mergeSort(arr, 0, n - 1);

    std::cout << "After Merge Sort, we get... " << endl;
    printArray(arr, n);
    return(0);
}
