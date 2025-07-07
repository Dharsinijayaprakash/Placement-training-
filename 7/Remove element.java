class Solution {
    public int removeElement(int[] s, int v) {
        int k = 0; 

        for (int i = 0; i < s.length; i++) {
            if (s[i] != v) {
                s[k] = s[i]; 
                k++;
            }
        }

        return k; 
    }
}
