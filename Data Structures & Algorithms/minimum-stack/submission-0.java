class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mins;
    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        if(mins.isEmpty()){
            mins.add(val);
        }
        else{
            int min = mins.peek();
            if (val <= min) {
                mins.add(val);
            }
            else {
                mins.pop();
                mins.add(val);
                mins.add(min);
            }
        }
        stack.add(val);
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
            mins.add(min);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
