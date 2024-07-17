package SixKyu;

import java.util.Stack;

public class testStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //ketika pop maka paling ujung akan dikeluarkan
        //! prinsip last in first out
    }
}
