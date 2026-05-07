class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        HashSet<Character> h = new HashSet<Character>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            char cur = s.charAt(right);
            while (h.contains(cur)) {
                h.remove(s.charAt(left));
                left++;
            }
            h.add(cur);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
