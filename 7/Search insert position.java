class Solution {
    public int searchInsert(int[] s, int t) {
        int left = 0, right = s.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (s[mid] == t) {
                return mid; 
            } else if (s[mid] < t) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return left; 
    }
}
