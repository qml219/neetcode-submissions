class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer[]> pq = new PriorityQueue<Integer[]>((a, b) -> a[1] - b[1]);

        for (Integer num : h.keySet()) {
            pq.add(new Integer[]{num, h.get(num)});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // List<Integer> res = new ArrayList<Integer>();
        // pq.forEach(e -> res.add(e[0]));
        // return res.stream().mapToInt(i -> i).toArray();
        // return res;

        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll()[0];
        }
        return res;
    }
}
