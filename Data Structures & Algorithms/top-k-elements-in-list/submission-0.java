class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<int[]> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            ans.add(new int[]{ent.getValue(),ent.getKey()});
        }
        ans.sort((a,b)->b[0]-a[0]);
        int res[] = new int[k];
        for(int i=0;i<k;i++)
           res[i] = ans.get(i)[1];
        return res;
    }
}
