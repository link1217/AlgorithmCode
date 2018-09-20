package expression;

import java.util.List;
import java.util.Stack;

/**
 * 后缀表达式求值
 */
public class PostExpression {
    public static int postExp(String str) {
        List<String> list = In2Post.in2Post(str);
        Stack<Integer> stack = new Stack<>();
        for (String s : list) {
            if (s.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if (s.equals("-")) {
                int tmp = stack.pop();
                stack.push(stack.pop() - tmp);
            } else if (s.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if (s.equals("/")) {
                int tmp = stack.pop();
                stack.push(stack.pop() / tmp);
            } else
                stack.push(Integer.valueOf(s));
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(postExp("12+34*56*(78-90)"));
    }
}
