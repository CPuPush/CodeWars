package SixKyu;

import java.util.Stack;

public class ValidBrances {

    public static void main(String[] args) {
        System.out.println(isValid("((()))"));
    }

    public static boolean isValid(String braces){
        Stack<Character> stack = new Stack<Character>();

        for (char c : braces.toCharArray()) {
            // If the character is an opening brace, push it onto the stack
//            if (c == '(' || c == '[' || c == '{') {
            if (c == '(') {
                stack.push(c);
            } else {
                // If the stack is empty, there's no matching opening brace
//                if (stack.isEmpty()) {
//                    System.out.println(stack);
//                    System.out.println("testings");
//                    return false;
//                }

                // Check if the current closing brace matches the opening brace on top of the stack
                char top = stack.pop();
                System.out.println(top);
//                if ((c == ')' && top != '(') ||
//                        (c == ']' && top != '[') ||
//                        (c == '}' && top != '{')) {
                    if ((c == ')' && top != '(')) {
//                    System.out.println("test");
                        return false;
                    }
                }
            }


        // If the stack is empty, all braces were matched correctly
        return stack.isEmpty();
    }
}
