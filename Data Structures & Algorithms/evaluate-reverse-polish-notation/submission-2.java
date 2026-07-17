class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length;i++) {
            String next = tokens[i];
            System.out.println(next);
            if(next.equals("*")) {
                int second = stack.peek();
                stack.pop();
                int first = stack.peek();
                stack.pop();
                stack.push(first * second);
            }
            else if(next.equals("+")) {
                int second = stack.peek();
                stack.pop();
                int first = stack.peek();
                stack.pop();
                stack.push(first + second);
            }
            else if(next.equals("-")) {
                int second = stack.peek();
                stack.pop();
                int first = stack.peek();
                stack.pop();
                stack.push(first - second);
            }
            else if(next.equals("/")) {
                int second = stack.peek();
                stack.pop();
                int first = stack.peek();
                stack.pop();
                stack.push(first / second);
            }
            else{
                stack.push(Integer.valueOf(next));
            }
            System.out.println(stack.peek());
        }
        return stack.peek();
    }
}
