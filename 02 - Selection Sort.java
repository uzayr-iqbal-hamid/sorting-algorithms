class Solution {
	int select(int arr[], int start, int end) {
        int max = start;
        for (int i = start; i<=end; i++){
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
	}
	
	void selectionSort(int arr[], int n){
	    
	    for (int i = 0; i < n; i++) {
	        int last = n - i - 1;
	        int maxIndex = select(arr, 0, last);
	
	        int temp = arr[maxIndex];
	        arr[maxIndex] = arr[last];
	        arr[last] = temp;
	    }
  }
	
}
