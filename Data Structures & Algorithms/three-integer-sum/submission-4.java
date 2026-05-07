class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // HashSet<List<Integer>> res = new HashSet<List<Integer>>();
        // for (int i = 0; i < n; i++) {
        //     int cur = nums[i];
        //     List<List<Integer>> cur_res = twoSum(nums, i+1, n-1, -cur);
        //     cur_res.forEach(l -> l.add(cur));
        //     cur_res.forEach(l -> res.add(l));
        // }
        // return new ArrayList<>(res);
    // }

    // public List<List<Integer>> twoSum(int[] nums, int start, int end, int target) {
    //     int i = start;
    //     int j = end;
    //     List<List<Integer>> res = new ArrayList<List<Integer>>();
    //     while (i < j) {
    //         if (nums[i] + nums[j] == target) {
    //             res.add(new ArrayList(List.of(nums[i], nums[j])));
    //             i++;
    //             j--;
    //         } else if (nums[i] + nums[j] > target) {
    //             j--;
    //         } else {
    //             i++;
    //         }
    //     }
    //     return res;

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int cur_sum = nums[i] + nums[j] + nums[k];
                if (cur_sum == 0) {
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k+1]) {
                        k--;
                    }
                } else if (cur_sum > 0) {
                    k--;
                    while (j < k && nums[k] == nums[k+1]) {
                        k--;
                    }
                } else {
                    j++;
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                }
            }
        }

        return res;


    }
}
