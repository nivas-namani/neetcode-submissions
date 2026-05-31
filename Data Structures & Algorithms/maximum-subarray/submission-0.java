class Solution {
    public int maxSubArray(int[] nums) {
        int sum=-1,cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            sum=Math.max(sum,cursum);
            if(cursum<0)
                cursum=0;
        }
        return sum;
    }
}
