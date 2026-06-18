class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countArr = new int[26];
        for(char m: magazine.toCharArray()){
            countArr[m - 'a']++;
        }
        for(char r: ransomNote.toCharArray()){
            countArr[r - 'a']--;
            if(countArr[r - 'a'] < 0) return false;
        }
        return true;
    }
}