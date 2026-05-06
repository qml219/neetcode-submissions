class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<Character>();
        int n = s.length();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
                while (h.contains(c)) {
                    h.remove(s.charAt(left));
                    left++;
                }
            h.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
