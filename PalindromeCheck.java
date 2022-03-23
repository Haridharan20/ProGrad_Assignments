/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromecheck;

/**
 *
 * @author VC
 */
import java.util.*;

public class PalindromeCheck {

    public static boolean checkpal(String s) {
        int first = 0;
        int last = s.length() - 1;
        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static String reverse(String s) {
        int len = s.length() - 1;
        String rev = "";
        while (len >= 0) {
            rev += s.charAt(len);
            len--;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();

        int end = s.length() - 1;

        String sub = "";
        int itr = end - 1;
        if (checkpal(s)) {
            System.out.println("Already Palindrome");
        } else {
            int flag = 0;
            while (itr >= 0) {
                if (s.charAt(itr) == s.charAt(end)) {
                    flag = 1;
                    sub = s.substring(itr, s.length());
                    // System.out.println(sub);
                    if (checkpal(sub)) {
                        s = s + reverse(s.substring(0, itr));

                    } else {
                        s = s + reverse(s.substring(0, end));
                    }
                    System.out.println("The resultant string is:");
                    System.out.println(s);
                    break;
                } else {
                    itr--;
                }
            }
            if (flag == 0) {
                sub = s.substring(0, end);
                s = s + reverse(s.substring(0, end));
                System.out.println("The resultant string is:");
                System.out.println(s);
            }
        }
    }
}
