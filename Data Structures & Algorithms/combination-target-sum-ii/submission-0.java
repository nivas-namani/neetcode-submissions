class Solution {
    public void findCombinations(int[] nums, int target, int n, List<List<Integer>> ans, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (n == nums.length) {
            return;
        }        
        for (int i = n; i < nums.length; i++) {
            if (i > n && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            list.add(nums[i]);
            findCombinations(nums, target - nums[i], i + 1, ans, list);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        findCombinations(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
}
