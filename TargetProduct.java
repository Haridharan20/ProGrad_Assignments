/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package targetproduct;

import java.util.Arrays;

/**
 *
 * @author VC
 */
import java.util.*;

public class TargetProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of the array");
        int size = sc.nextInt();
        Integer arrs[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            arrs[i] = sc.nextInt();
        }
        Integer[] cpy = Arrays.copyOf(arrs, arrs.length);
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arrs));
        Integer arr[]=null;
        if(set.size()==1)
        {
            arr=new Integer[set.size()==1?2:set.size()];
            set.toArray(arr);
            arr[1]=arr[0];
        }
        else{
            arr=Arrays.copyOf(cpy, cpy.length);
        }
        
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start < end) {
            int prd = arr[start] * arr[end];
            if (prd == target) {
                count++;
                start++;
                end--;
            } else if (prd < target) {
                start++;
            } else {
                end--;
            }

        }
        System.out.println("Total count is:"+" "+count);
    }

}
