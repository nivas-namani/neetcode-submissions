class Solution {
    public int func(int[] nums,int n,HashMap<Integer,Integer> memo ){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n>=nums.length)
            return 0;
        int left = nums[n] + func(nums,n+2,memo);
        int right = func(nums,n+1,memo);
        memo.put(n,Math.max(left,right));
        return Math.max(left,right);
    }
    public int rob(int[] nums) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        return func(nums,0,memo);
    }
}
