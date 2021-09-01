package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {



    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '{' || curr == '(' || curr == '[') {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = stack.pop();
                if (curr == ')' && top != '(' ||
                        curr == '}' && top != '{' ||
                        curr == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        List<Character> list = new ArrayList<>();
        list.add('(');
        list.add('[');
        list.add('{');
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (list.contains(curr)) {
                st.push(curr);
            } else {
                if (curr == ')') {
                    if (st.lastElement() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                if (curr == ']') {
                    if (st.lastElement() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                if (curr == '}') {
                    if (st.lastElement() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return !st.isEmpty();
    }


}
