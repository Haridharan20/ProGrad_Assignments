package validparentheses;

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parenthese: ");
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        Character open[] = {'{', '(', '['};
        Map<Character, Character> openPairs = new HashMap<>();
        openPairs.put('{', '}');
        openPairs.put('[', ']');
        openPairs.put('(', ')');

        Map<Character, Character> closePairs = new HashMap<>();
        closePairs.put('}', '{');
        closePairs.put(']', '[');
        closePairs.put(')', '(');
        int inidx = 0;
        List<Character> list = Arrays.asList(open);
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
                inidx = i;

            } else {
                char top = stack.peek();
                if (top == closePairs.get(s.charAt(i))) {
                    stack.pop();
                    inidx = i;

                }
//                else{
//                    System.out.println("Not valid string "+i);
//                }
            }
        }
//        System.out.println(stack);

        String closeString = "";
        if (stack.isEmpty()) {
            System.out.println("Valid");

//            System.out.println("stack "+stack);
        } else {

            int length = stack.size() - 1;
            for (int i = length; i >= 0; i--) {
                char close = openPairs.get(stack.get(i));
                closeString += close;
            }
            String org = s.substring(0, inidx + 1);
//            System.out.println("org "+org);
//            System.out.println("close "+closeString);
            System.out.println("Result:");
            System.out.println(org + closeString);
        }

    }

}
