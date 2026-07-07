class Solution {
    public String sortVowels(String s) {

        // Time: O(n + k log k) (k = number of vowels) and Space: O(k)

        char arr[] = s.toCharArray();

        ArrayList<Character> al = new ArrayList<Character>();

        for(int i = 0; i < arr.length; i++) {
            if(isVowel(arr[i])) {
                al.add(arr[i]);
            }
        }

        Collections.sort(al);

        int k = 0;

        for(int j = 0; j < arr.length; j++) {
            if (isVowel(arr[j])) {
                arr[j] = al.get(k);
                k++;
            }
        }
        return new String(arr);
    }

    
    private boolean isVowel(char c) {
         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
       }
}