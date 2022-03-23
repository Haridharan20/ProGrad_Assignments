package permutation_calculations;

/**
 *
 * @author Hari
 */
import java.util.*;

public class Permutation_Calculations {

    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();

        for (int i = 0; i < length; i++) {
            dict.put(s.charAt(i), (dict.getOrDefault(s.charAt(i), 0) + 1));
        }

        int nominator = fact(length);
        int denominator = 1;
        for (Map.Entry<Character, Integer> entry : dict.entrySet()) {
            denominator = denominator * fact(entry.getValue());
        }

        int answer = nominator / denominator;
        System.out.println(answer);

    }

}
