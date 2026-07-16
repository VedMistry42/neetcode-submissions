class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mins;
    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        if(!mins.isEmpty()){
            int min = mins.peek();
            if (val <= min) {
                mins.push(val);
            }
            else {
                mins.pop();
                mins.push(val);
                mins.push(min);
            }
            
        }
        else{
            mins.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        int top = stack.peek();
        stack.pop();
        int min = mins.peek();
        if(top==min) {
            mins.pop();
        }
        else {
            mins.pop();
            mins.pop();
            mins.push(min);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
