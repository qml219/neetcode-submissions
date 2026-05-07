class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> h = new HashMap<>();
        int maxFreq = 0;
        int n = s.length();
        int left = 0;
        int res = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            h.put(c, h.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, h.get(c));

            while ((right - left + 1) - maxFreq > k) {
                h.put(s.charAt(left), h.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
