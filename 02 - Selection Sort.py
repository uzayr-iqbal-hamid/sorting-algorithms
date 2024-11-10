class Solution: 
    def swap(self, arr, i, min):
        temp = arr[i]
        arr[i] = arr[min]
        arr[min] = temp
        
        return arr
    
    def selectionSort(self, arr,n):
        for i in range(n):
            min = i
            for j in range(i + 1, n):
                if arr[j] < arr[min]:
                    min = j

            self.swap(arr, i, min)
            
        return arr
