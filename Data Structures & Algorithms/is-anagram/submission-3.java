class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> h = new HashMap<Character, Integer>();
        int m = s.length();
        int n = t.length();
        if (m != n) return false;
        for (int i = 0; i < m; i++) {
            char curr = s.charAt(i);
            // if (h.containsKey(curr)) {
            //     h.put(curr, h.get(curr) + 1);
            // }
            // else {
            //     h.put(curr, 1);
            // }
            h.put(curr, h.getOrDefault(curr, 0) + 1);
        }
        
        for (int j = 0; j < n; j++) {
            char curr = t.charAt(j);
            if (h.containsKey(curr)) {
                int curr_freq = h.get(curr);
                if (curr_freq == 1) {
                    h.remove(curr);
                }
                else {
                    h.put(curr, curr_freq - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
