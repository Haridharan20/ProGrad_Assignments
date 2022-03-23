package perfectstring;

import java.util.*;

public class PerfectString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        s = s.toUpperCase();
        int i, flag = 0;
        int length = s.length();
        if (length == 2) {
            if (s.charAt(0) == 'P' && s.charAt(1) == 'R' || s.charAt(0) == 'R' && s.charAt(1) == 'P') {
                System.out.println("Perfect");
            } else {
                System.out.println("Not Perfect");
            }

        } else {
            for (i = 0; i < length - 2; i++) {

                if (s.charAt(i) == 'P') {
                    if (s.charAt(i + 2) == 'P' && s.charAt(i + 1) == 'R') {
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }

                } else if (s.charAt(i) == 'R') {
                    if (s.charAt(i + 2) == 'R' && s.charAt(i + 1) == 'P') {
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }

                }

            }
            if (flag == 1) {
                System.out.println("Perfect");
            } else {
                System.out.println("Not Perfect");
            }
        }

    }

}
