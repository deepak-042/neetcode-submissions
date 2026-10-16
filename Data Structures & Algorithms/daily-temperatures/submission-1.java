class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int  n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(res,0);
        stack.push(0);
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int j = stack.pop();
                res[j] = i-j;
            }
            stack.push(i);
        }
        return res;
    }
}
