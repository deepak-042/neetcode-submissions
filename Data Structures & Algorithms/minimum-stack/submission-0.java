class MinStack {
    Stack<Integer> stack;
    Stack<Integer> s;
    public MinStack() {
        stack = new Stack<>();
        s  = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(s.isEmpty() || s.peek() >= val){
            s.push(val);
        }
        
    }
    
    public void pop() {
        int p = stack.pop();
        if(p == s.peek()){
            s.pop();
        }
    }
    
    public int top() {
        int ans = stack.peek();
        return ans;
    }
    
    public int getMin() {
        return s.peek();
    }
}
