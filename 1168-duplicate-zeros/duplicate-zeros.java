class Solution {
    public void duplicateZeros(int[] arr) {
        // Time: O(n^2) and Space: O(1)
        int n = arr.length;
        for(int i = 0 ; i < n - 1; i++) {
            if(arr[i] == 0) {
                for(int j = n - 1 ; j > i + 1 ; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;

                /* 
                class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Count zeros
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        int i = n - 1;
        int j = n + zeros - 1; // Virtual index

        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }
}
a better version of it O(n) and O(1) tc and sc
*/
            }
        }
    }
}