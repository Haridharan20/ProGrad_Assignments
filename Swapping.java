/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swapping;

/**
 *
 * @author Hari
 */
import java.util.*;

public class Swapping {

    public static void SwapArray(ArrayList<Integer>num,int n)
    {
        int i, length, temp;
        if (n % 2 == 0) {
            length = num.size();
        } else {
            length = num.size() - 1;
        }
        for (i = 0; i < length; i += 2) {
            temp = num.get(i);
            num.set(i, num.get(i+1));
            num.set(i + 1, temp);
        }
        System.out.println("Swapped Array:");
        for (i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int i;
        System.out.println("Enter the Element");
        for (i = 0; i < n; i++) {

            int val = sc.nextInt();
            num.add(val);
        }
        SwapArray(num, n);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

//         int nums[]={1,2,3,4,5,6};
//         int length=0;
//         int first,second;
//         int original=nums.length;
//         if(nums.length%2==0)
//         {
//             length=nums.length;
//         }
//         else{
//             length=nums.length-1;
//         }
//       
//         for(int i=0;i<length;i+=2)
//         {
//             first=nums[i];
//             second=nums[i+1];
//             nums[i+1]=first;
//             nums[i]=second;
//         }
//         for(int i=0;i<original;i++)
//         {
//             System.out.print(nums[i]+ " ");
//         }
    
