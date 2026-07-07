class Solution {
    public boolean validPalindrome(String s) {

        // Time Complexity: O(n) and Space Complexity: O(1)

        char arr[] = s.toCharArray();
        int left = 0; 
        int right = arr.length - 1;
        
        while(left < right) {
            if(arr[left] == arr[right]) {
                left++;
                right--;
            }
            else {
                return check(arr, left + 1, right) || 
                       check(arr, left, right - 1);
            }
        }
        return true;
    }

    private boolean check(char[] arr, int left, int right) {

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}