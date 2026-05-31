class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int h : hand){
            map.put(h,map.getOrDefault(h,0)+1);
        }
        System.out.print(map);
        Arrays.sort(hand);
        for(int num : hand){
            if(map.get(num)>0){
                map.put(num,map.get(num)-1);
                for(int i=1;i<groupSize;i++){
                    int next = num + i;
                    if (map.getOrDefault(next, 0) > 0) {
                        map.put(next, map.get(next) - 1);
                    } else {
                        return false;
                    }
                }
            }
        }
        System.out.print(map);
        return true;
    }
}
