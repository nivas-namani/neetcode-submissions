class Solution {
    public void func(List<Integer> input,List<List<Integer>> ans,List<Integer> list){
        if(input.isEmpty()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<input.size();i++){
            list.add(input.get(i));
            int temp = input.get(i);
            input.remove(i);
            func(input,ans,list);
            list.remove(list.size()-1);
            input.add(i,temp);
        }
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> input = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i : nums)
            input.add(i);
        func(input,ans,new ArrayList<>());
        return ans;
    }
}
