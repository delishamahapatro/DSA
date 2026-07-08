class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else { 
                mp.put(nums[i], 1); 
                }
                if(mp.get(nums[i]) > nums.length / 2) {
                    return nums[i];
            }
        }
    return -1;


    /* 

    optimal O(n)
    class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
    */
    }
}