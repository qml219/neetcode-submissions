class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        int lastStart = 0;
        int maxLength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char cur = s.charAt(i);
            if (h.containsKey(cur)) {
                maxLength = Math.max(maxLength, i - lastStart);
                lastStart = Math.max(lastStart, h.get(cur) + 1);
            }
            h.put(cur, i);
        }

        return Math.max(maxLength, n - lastStart);
    }
}
