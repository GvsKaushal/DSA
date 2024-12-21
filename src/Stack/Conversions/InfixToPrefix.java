package Stack.Conversions;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {

        String string = "(A–B/C)*(A/K-L)";
        String result = InfixToPrefixConversion(string);
        System.out.println(string);
        System.out.println(result);

    }

    private static String InfixToPrefixConversion(String s) {


        s = reverse(s);

        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < len; i++) {

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

                if (s.charAt(i) == '^') {
                    while (!stack.isEmpty() && priority(s.charAt(i)) <= priority(stack.peek())) {
                        stringBuilder.append(stack.pop());
                    }
                } else {
                    while (!stack.isEmpty() && priority(s.charAt(i)) < priority(stack.peek())) {
                        stringBuilder.append(stack.pop());
                    }
                }

                stack.push(s.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        stringBuilder.reverse();

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

    private static String reverse(String s) {

        StringBuilder reversedInput = new StringBuilder();
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                reversedInput.append(')');
            } else if (c == ')') {
                reversedInput.append('(');
            } else {
                reversedInput.append(c);
            }
        }

        return String.valueOf(reversedInput);
    }

}
