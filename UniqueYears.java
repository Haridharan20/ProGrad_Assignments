/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uniqueyears;

/**
 *
 * @author VC
 */
import java.util.*;

public class UniqueYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();

        ArrayList<String> Date = new ArrayList<String>();
        HashSet<String> set = new HashSet<String>();

        String regex = "(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])-(0[1-9]|1[0-2]|[1-9])-([0-9]{4}[,!.]?)";
        String split[] = s.split("\\s");

        for (String s1 : split) {
            if (s1.matches(regex)) {
                Date.add(s1);
            }

        }
//        System.out.println(Arrays.toString(Date.toArray()));
        ArrayList<String> Years = new ArrayList<String>();

        for (String year : Date) {
            String arr[] = year.split("-");
            Years.add(arr[2].substring(0, 4));

        }
//        System.out.println(Arrays.toString(Years.toArray()));
        String yearRegx = "([0-9]{4})";
        for (String y : Years) {
            if (y.matches(yearRegx)) {

                set.add(y);
            }
        }
        System.out.println("Unique Year :" + set.size());

    }

}
