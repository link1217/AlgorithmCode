package expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中缀表达式转后缀表达式
 */
public class In2Post {
    /**
     * 中缀表达式的字符串转后缀表达式的字符串集合
     * @param str
     * @return
     */
    public static List<String> in2Post(String str) {
        List<String> inList = str2List(str);
        List<String> postList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        for (String s : inList) {
            if (s.equals("("))
                stack.push(s);
            else if (s.equals(")")) {
                while (!stack.peek().equals("("))
                    postList.add(stack.pop());
                stack.pop();
            } else if (s.equals("+") || s.equals("-")) {
                while (!stack.isEmpty() && !stack.peek().equals("("))
                    postList.add(stack.pop());
                stack.push(s);
            } else if (s.equals("*") || s.equals("/")) {
                while (!stack.isEmpty() && !stack.peek().equals("(") && (stack.peek().equals("*") || stack.peek().equals("/")))
                    postList.add(stack.pop());
                stack.push(s);
            } else
                postList.add(s);
        }
        while(!stack.isEmpty())
            postList.add(stack.pop());
        return postList;
    }

    /**
     * 将字符串表示的表达式转换为list集合
     *
     * @param str
     * @return
     */
    private static List<String> str2List(String str) {
        List<String> list = new ArrayList<>();
        int cur = -1, left = 0;
        while (++cur < str.length()) {
            char ch = str.charAt(cur);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' || ch == ')') {
                if (left < cur)
                    list.add(str.substring(left, cur));
                list.add(ch + "");
                left = cur + 1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> inList = str2List("12+34*56*(78-90)");
        System.out.println(inList);
        List<String> postList = in2Post("12+34*56*(78-90)");
        System.out.println(postList);
    }
}
