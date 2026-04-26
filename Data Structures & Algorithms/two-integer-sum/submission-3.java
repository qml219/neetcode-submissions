class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];

            if (s.containsKey(other)) {
                return new int[]{s.get(other), i};
            }

            s.put(nums[i], i);
        }
        return new int[]{};
    }
}
