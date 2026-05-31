class Solution {
    public void func(int[] nums,int n,Set<List<Integer>> set,List<Integer> list){
        if(n==nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[n]);
        func(nums,n+1,set,list);
        list.remove(list.size()-1);
        func(nums,n+1,set,list);
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        func(nums,0,set,new ArrayList<>());
        ans.addAll(set);
        return ans;
    }
}
