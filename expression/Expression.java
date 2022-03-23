/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expression;

/**
 *
 * @author Hari
 */
import java.util.*;

public class Expression {

    public static void calculate(String input[]) {
        int res = 0;
        int val1 = Integer.parseInt(input[0]);
        int val2 = Integer.parseInt(input[2]);
        try {
            switch (input[1]) {
                case "+":
                    res = val1 + val2;
                    break;
                case "-":
                    res = val1 - val2;
                    break;
                case "*":
                    res = val1 * val2;
                    break;
                case "/":
                    res = val1 / val2;
                    break;
                case "%":
                    res = val1 % val2;
                    break;
                default:
                    throw new ExpressionExec("Invalid Operator");
            }
            System.out.println("The answer for expression is" + " " + res);
        } catch (ExpressionExec e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> fre = new HashMap<String, Integer>();
        String symbol[] = {"+", "-", "*", "/", "%"};
        int res, sc = 0;

        try {
            String in = s.nextLine();
            String input[] = in.split("\\s");
            List<String> list = Arrays.asList(symbol);
            Integer.parseInt(input[0]);
            Integer.parseInt(input[0]);
            for (String op : input) {
                if (fre.get(op) == null && list.contains(op)) {
                    fre.put(op, 1);
                } else if (list.contains(op)) {
                    fre.put(op, fre.get(op) + 1);
                }
            }
            System.out.println(fre);
            int oc = 0;
            for (Integer val : fre.values()) {
                if (val >= 1) {
                    oc += 1;
                }
            }
            System.out.println(oc);
            if (oc > 1) {
                throw new ExpressionExec("Too many operators are used");
            }
            if (list.contains(input[0])) {
                throw new ExpressionExec("First should be Number");
            }
            if (!list.contains(input[1])) {
                throw new ExpressionExec("Second should be symbol");
            }
            if (list.contains(input[2])) {
                throw new ExpressionExec("Third should be Number");
            }
            if (input[1].equals("/") && Integer.parseInt(input[2]) == 0) {
                throw new ExpressionExec("Second input is not allowed as in division operation ");
            }
            calculate(input);
        } catch (ExpressionExec e) {
            System.out.println(e);
        } catch (NumberFormatException ne) {
            System.out.println("Operands Should be Number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Third should be Number");
        }

    }
}
