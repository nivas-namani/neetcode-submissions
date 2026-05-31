class Solution {
    public void func(int[] nums,int n,List<List<Integer>> ans,List<Integer> list){
        if(n==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[n]);
        func(nums,n+1,ans,list);
        list.remove(list.size()-1);
        func(nums,n+1,ans,list);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,0,ans,new ArrayList<>());
        return ans;
    }
}
