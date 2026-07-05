class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int m = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != val) {
                nums[m] = nums[i];
                m++;
            }
        }
        return m;

        /*
        int i = 0;
        int n = nums.length;
        while(i < n) {
           if(nums[i] == val) {
              nums[i] = nums[n - 1];
              n--;
           } else {
              i++;
           }
        }

        */
    }
}