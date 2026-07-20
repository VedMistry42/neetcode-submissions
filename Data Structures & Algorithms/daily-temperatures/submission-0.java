class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int[] result = new int[len];
        for(int i=0; i<len; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]) {
                int curr = stack.pop();
                result[curr] = i-curr;
            }
            stack.push(i);
        }
        for(int i:stack) {
            result[i] =0;
        }
        return result;

    }
}
