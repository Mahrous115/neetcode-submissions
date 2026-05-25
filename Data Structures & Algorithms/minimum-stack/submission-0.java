

class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> mins;

    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (mins.isEmpty() || val <= mins.peek()) {
            mins.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();
        if (removed == mins.peek()) {
            mins.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}