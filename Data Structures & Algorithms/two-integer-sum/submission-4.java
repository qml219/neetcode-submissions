class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (h.containsKey(rest)) {
                res[0] = h.get(rest);
                res[1] = i;
            } 
            h.put(nums[i], i);
        }

        return res;
    }
}
