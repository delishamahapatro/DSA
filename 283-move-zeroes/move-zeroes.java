class Solution {
    public void moveZeroes(int[] nums) {
        /*
        we have 2 different approach's
        1 -> check using for loop and if its not 0 put it in array and when 0 pops in using while loop create another array, put it in the end
        2 -> 2 pointer approach, where in we check the element if != 0 use temp and swap with next element
        */

        /*
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        while ( k < nums.length) {
            nums[k] = 0;
            k++;
            */

            int j = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
    }
}