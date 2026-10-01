class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int len = 1;
        for(int n : set){
            if(!set.contains(n-1)){
                int currentn = n;
                int count = 1;
                while(set.contains(currentn + 1)){
                    count++;
                    currentn++;
                }
                len = Math.max(len , count);
            }
            
        }
        return len;
        
    }
}
