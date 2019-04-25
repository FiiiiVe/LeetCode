package Valid_Parentheses;

import java.util.Stack;

public class MySolution {
    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int i = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack[i++] = c;
                    break;
                case ')':
                    if (i == 0 || stack[--i] != '(') return false;
                    break;
                case ']':
                    if (i == 0 || stack[--i] != '[') return false;
                    break;
                case '}':
                    if (i == 0 || stack[--i] != '{') return false;
                    break;
            }
        }
        return i == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

}
