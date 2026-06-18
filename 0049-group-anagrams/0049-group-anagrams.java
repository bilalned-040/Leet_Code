class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String unsorted: strs){
            char[] arr = unsorted.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            map.computeIfAbsent(sorted, k -> new ArrayList<>())
            .add(unsorted);
        }
        return new ArrayList<>(map.values());
    }
}