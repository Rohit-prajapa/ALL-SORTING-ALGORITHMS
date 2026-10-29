class Stack {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == stack.length) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[top] = data;
        top++;
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack Underflow");
            return -1;
        }

        top--;
        int data = stack[top];
        stack[top] = 0;

        return data;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class prectics {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack:");
        st.show();

        System.out.println("Popped: " + st.pop());

        System.out.println("After pop:");
        st.show();
    }
}
