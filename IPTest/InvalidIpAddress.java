package com.invalid;

import java.util.Arrays;
import java.util.Scanner;

public class InvalidIpAddress {

    public static boolean isValid(String ip)
    {
        String address[]=ip.split("\\.");
        for(String add:address)
        {
            try{
                int bytes = Integer.parseInt(add);
                if(bytes<0 || bytes>255)
                {
                    return false;
                }
            }
            catch (Exception e)
            {
//                System.out.println(e);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IPv4 Address: ");
        String ip =  sc.next();
        if(isValid(ip)){
            System.out.println("Valid IPv4");
        }
        else{
            System.out.println("Not Valid IPv4");
        }

    }
}
