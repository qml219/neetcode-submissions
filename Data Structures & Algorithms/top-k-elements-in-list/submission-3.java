class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        // for (int num : nums) {
        //     h.put(num, h.getOrDefault(num, 0) + 1);
        // }

        // PriorityQueue<Integer[]> pq = new PriorityQueue<Integer[]>((a, b) -> a[1] - b[1]);

        // for (Integer num : h.keySet()) {
        //     pq.add(new Integer[]{num, h.get(num)});

        //     if (pq.size() > k) {
        //         pq.poll();
        //     }
        // }

        // List<Integer> res = new ArrayList<Integer>();
        // pq.forEach(e -> res.add(e[0]));
        // return res.stream().mapToInt(i -> i).toArray();
        // return res;

        // int[] res = new int[k];
        // int i = 0;
        // while (!pq.isEmpty()) {
        //     res[i++] = pq.poll()[0];
        // }
        // return res;
        int n = nums.length;

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] b = new ArrayList[n+1];

        h.forEach((key, val) -> {
            if (b[val] == null) {
                b[val] = new ArrayList<Integer>();
            }
            b[val].add(key);
        });

        int[] res = new int[k];
        int r = 0;
        for (int j = n; j >= 0; j--) {
            if (b[j] != null) {
                for (int i = 0; i < b[j].size(); i++) {
                    res[r++] = b[j].get(i);
                    if (r == k) return res;
                }
            }
        }   

        return res;


    }
}
