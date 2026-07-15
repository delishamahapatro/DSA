class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] numsans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            numsans[i] = nums[i] * nums[i];
        }
        Arrays.sort(numsans);
        return numsans;
        // O(n log n)

        /* 
        class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[index] = nums[left] * nums[left];
                left++;
            } else {
                ans[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }

        return ans;
    }
}
Time Complexity

Square + Sort: O(n log n)
Two Pointers: O(n)
*/
    }
}