package Stack.Conversions;

import java.util.Stack;

public class PrefixToInfix {

    public static void main(String[] args) {

        String string = "*-A/BC-/AKL";
        String result = PrefixToInfixConversion(string);
        System.out.println(string);
        System.out.println(result);
    }

    private static String PrefixToInfixConversion(String s) {

        int len = s.length();
        Stack<String> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = len - 1; i >= 0; i--) {

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ||
                    s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                    s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                stack.push(s.substring(i, i + 1));
            } else {

                if (!stack.isEmpty()) {
                    String firstPop = stack.pop();
                    String secondPop = stack.pop();

                    stringBuilder.append("(");
                    stringBuilder.append(firstPop);
                    stringBuilder.append(s.substring(i, i + 1));
                    stringBuilder.append(secondPop);
                    stringBuilder.append(")");

                    stack.push(String.valueOf(stringBuilder));
                    stringBuilder.setLength(0);
                }

            }
        }

        String result = stack.pop();

        return result;
    }
}
