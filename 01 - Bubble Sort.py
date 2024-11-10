class Solution:
    #Function to sort the array using bubble sort algorithm.
    def bubbleSort(self,arr, n):
        
        for i in range(n-1, -1, -1):
            for j in range(i-1, -1, -1):
                if arr[j] > arr[i]:
                    temp = arr[j]
                    arr[j] = arr[i]
                    arr[i] = temp
            
        return arr
