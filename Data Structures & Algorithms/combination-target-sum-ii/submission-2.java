class Solution {
    public void func(int[] nums,int target,int n,List<List<Integer>> ans,List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(n>=nums.length)
            return;
        for(int i=n;i<nums.length;i++){
            if(i>n && nums[i]==nums[i-1])
                continue;
            if(target < nums[i])
             continue;
            list.add(nums[i]);
            func(nums,target-nums[i],i+1,ans,list);
            list.remove(list.size()-1);
        }
        return;
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,target,0,ans,new ArrayList<>());
        return ans;
    }
}
