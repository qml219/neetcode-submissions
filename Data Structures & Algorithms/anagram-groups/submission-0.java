class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> h = new HashMap<String, List<String>>(); 
        int n = strs.length;

        for (String curr : strs) {
            int[] freq = new int[26];
            for (int i = 0; i < curr.length(); i++) {
                char c = curr.charAt(i);
                freq[c - 'a']++;
            }
            String freq_key = Arrays.toString(freq);

            if (!h.containsKey(freq_key)) {
                h.put(freq_key, new ArrayList<String>());
            }
            h.get(freq_key).add(curr);
        }

        List<List<String>> res = new ArrayList<List<String>>();
        for (List<String> group : h.values()) {
            res.add(group);
        }

        return res;
    }
}
