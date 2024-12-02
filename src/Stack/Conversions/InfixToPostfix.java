package Stack.Conversions;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {

        String string = "a+b*(c^d-e)^(f+g*h)-i";
        String result = InfixToPostfixConversion(string);
        System.out.println(string);
        System.out.println(result);

    }

    private static String InfixToPostfixConversion(String s) {

        int i = 0;
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while (i < len) {

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ||
                    s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                    s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                stringBuilder.append(s.charAt(i));

            } else if (s.charAt(i) == '(') {

                stack.push(s.charAt(i));

            } else if (s.charAt(i) == ')') {

                while (!stack.isEmpty()) {

                    if (stack.peek() != '(') {
                        stringBuilder.append(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.pop();

            } else {

                while (!stack.isEmpty() && priority(s.charAt(i)) <= priority(stack.peek())) {
                    stringBuilder.append(stack.pop());
                }
                stack.push(s.charAt(i));
            }

            i++;
        }

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }


        return String.valueOf(stringBuilder);
    }

    private static int priority(Character c) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('^', 3);
        hashMap.put('*', 2);
        hashMap.put('/', 2);
        hashMap.put('+', 1);
        hashMap.put('-', 1);

        if (hashMap.containsKey(c)) {
            return hashMap.get(c);
        }

        return -1;
    }
}
