class Solution {
    public int func(int[] nums,int n,HashMap<Integer,Integer> map){
        if(map.containsKey(n))
            return map.get(n);
        if(n>=nums.length)
            return 0;
        int left = nums[n]+func(nums,n+2,map);
        int right = func(nums,n+1,map);
        map.put(n,Math.max(left,right));
        return Math.max(left,right);
    }
    public int rob(int[] nums) {
        return func(nums,0,new HashMap<>());
    }
}
