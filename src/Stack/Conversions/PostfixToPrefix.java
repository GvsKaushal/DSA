package Stack.Conversions;

import java.util.Stack;

public class PostfixToPrefix {

    public static void main(String[] args) {

        String string = "ABC/-AK/L-*";
        String result = PostfixToPrefixConversion(string);
        System.out.println(string);
        System.out.println(result);
    }

    private static String PostfixToPrefixConversion(String s) {

        int len = s.length();
        Stack<String> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < len; i++) {

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ||
                    s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                    s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                stack.push(s.substring(i, i + 1));
            } else {

                if (!stack.isEmpty()) {
                    String firstPop = stack.pop();
                    String secondPop = stack.pop();

                    stringBuilder.append(s.charAt(i));
                    stringBuilder.append(secondPop);
                    stringBuilder.append(firstPop);

                    stack.push(String.valueOf(stringBuilder));
                    stringBuilder.setLength(0);
                }

            }
        }

        return stack.pop();
    }
}
