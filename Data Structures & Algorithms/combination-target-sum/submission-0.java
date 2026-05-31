class Solution {
    public void func (int[] nums, int target,int n,List<List<Integer>> ans,List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(n>=nums.length){
        return;
        }
        if(nums[n]<=target){
            list.add(nums[n]);
            func(nums,target-nums[n],n,ans,list);
            list.remove(list.size()-1);
        }
        func(nums,target,n+1,ans,list);
        return;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,target,0,ans,new ArrayList<>());
        return ans;
    }
}
