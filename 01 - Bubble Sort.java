import java.util.*;
import java.io.*;


class Solution
{
	public static void bubbleSort(int arr[], int n)
    {
        for (int i = 0; i<n; i++){
            for (int j = i + 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }   
            }
        }
    }
}
