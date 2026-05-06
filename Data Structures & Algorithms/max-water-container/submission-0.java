class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int area = 0;
        while (i < j) {
            if (heights[i] > heights[j]) {
                area = Math.max(area, heights[j] * (j - i));
                j--;
            }
            else {
                area = Math.max(area, heights[i] * (j - i));
                i++;
            }
        }
        return area;
    }
}
