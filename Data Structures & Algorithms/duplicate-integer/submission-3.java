class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int num : nums) {
            if (s.contains(num)) return true;
            s.add(num);
        }

        return false;
    }
}