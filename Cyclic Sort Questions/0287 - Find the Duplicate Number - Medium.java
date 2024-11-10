class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){

            if (nums[i] != i + 1) {

                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
