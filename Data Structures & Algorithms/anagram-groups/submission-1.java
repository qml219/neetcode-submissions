class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                int idx = c - 'a';
                freq[idx]++;
            }
            String key = Arrays.toString(freq);
    
            if (!hs.containsKey(key)) {
                hs.put(key, new ArrayList<String>());
            }
            hs.get(key).add(s);
    
        }

        return new ArrayList<>(hs.values());
    }
}
