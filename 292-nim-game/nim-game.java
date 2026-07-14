class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0) {
            return false;
        }
        return true;
        // tc & sc  =  O(1) both 
    }
}