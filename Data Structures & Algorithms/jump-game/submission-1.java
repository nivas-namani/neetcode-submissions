class Solution {
    public boolean func(int[] nums,int n,HashMap<Integer,Boolean> memo){
        if(memo.containsKey(n))
            return memo.get(n);
        if(n>=nums.length-1)
            return true;
        if(nums[n] == 0)
            return false;
        int end = Math.min(nums.length-1,n+nums[n]);
        for(int i=n+1;i<=end;i++){
            if(func(nums,i,memo)){
                memo.put(n,true);
                return true;
            }
        }
        memo.put(n,false);
        return false;
    }
    public boolean canJump(int[] nums) {
        HashMap<Integer,Boolean> memo = new HashMap<>();
        return func(nums,0,memo);
    }
}
