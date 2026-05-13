class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1_map = new int[26];
        int[] cur_map = new int[26];
        int cur_map_size = 0;

        if (s1.length() > s2.length()) return false;

        for (char c : s1.toCharArray()) {
            s1_map[c - 'a']++;
        }

        int k = s1.length();
        for (int r = 0; r < s2.length(); r++) {
            cur_map[s2.charAt(r) - 'a']++;

            if (r >= k) {
                cur_map[s2.charAt(r - k) - 'a']--;
            }

            if (Arrays.equals(cur_map, s1_map)) return true;
        }

        return false;
    }
}
