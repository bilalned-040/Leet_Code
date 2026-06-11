class Solution {
    public int majorityElement(int[] nums) {
        int me = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                int counter = map.get(num);
                counter++;
                map.put(num,counter);
            } 
            else map.put(num,1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > me) return entry.getKey();
        };
        return -1;
    }
}