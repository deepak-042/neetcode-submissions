class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        int zero = 0;
        for(int n : nums){
            if(n == 0) zero ++;
            else product = product * n;
        }
        for(int i = 0; i < nums.length ; i++){
            if(zero > 1){
                ans[i] = 0;
            }
            else if(zero == 1){
                ans[i] = nums[i] == 0 ? product : 0;
            }  
            else ans[i] = product/nums[i];
        }
        return ans;
        
    }
}  
