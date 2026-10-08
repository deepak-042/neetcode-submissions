class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int count = 0;
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                count = Math.max(count,set.size());
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return count;
    }
}
