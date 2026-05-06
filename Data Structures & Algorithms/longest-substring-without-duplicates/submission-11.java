class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        int lastStart = 0;
        int maxLength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char cur = s.charAt(i);
            if (h.containsKey(cur)) {
                lastStart = Math.max(lastStart, h.get(cur) + 1);
            }
            h.put(cur, i);
            maxLength = Math.max(maxLength, i - lastStart + 1);
        }

        return maxLength;
    }
}
