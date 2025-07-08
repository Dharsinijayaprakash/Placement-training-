import java.util.Arrays;
class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int[] t = new int[m + n];
        for (int i = 0; i < m; i++) {
            t[i] = n1[i];
        }
        for (int i = 0; i < n; i++) {
            t[m + i] = n[i];
        }
        Arrays.sort(t);
        for (int i = 0; i < m + n; i++) {
            n1[i] = t[i];
        }
    }
}

