class Solution {
    public boolean func(int[] nums, int i, HashMap<Integer,Boolean> memo){
        if(memo.containsKey(i))
            return memo.get(i);
        if(i==nums.length-1)
            return true;
        if(nums[i] == 0)
            return false;
        int end = Math.min(nums.length-1,i+nums[i]);
        for(int j=i+1;j<=end;j++){
            if(func(nums,j,memo)){
                memo.put(i,true);
                return true;
            }
        }
        memo.put(i,false);
        return false;
    }
    public boolean canJump(int[] nums) {
        HashMap<Integer,Boolean> memo = new HashMap<>();
        return func(nums,0,memo);
    }
}
