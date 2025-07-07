class Solution {
    public int removeDuplicates(int[] s) {
        if (s.length == 0) return 0;
        int k = 1; 
        for (int i = 1; i < s.length; i++) {
            if (s[i] != s[k - 1]) {
                s[k] = s[i]; 
                k++;
            }
        }

        return k; 
    }
}
