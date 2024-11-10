class Solution
{
  static void insert(int arr[],int i)
  {
       int temp = arr[i];
       arr[i] = arr[i - 1];
       arr[i - 1] = temp;
  }
  public void insertionSort(int arr[], int n)
  {
      for (int i = 0; i < arr.length - 1; i++) {
          for (int j = i + 1; j > 0; j--) {
              if (arr[j] < arr[j - 1]){
                  insert(arr, j);
              }
          }
      }
  }
}
