/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentfile;

/**
 *
 * @author VC
 */
import java.io.*;
import java.util.*;

public class StudentFile {

    public static void write()
    {
        System.out.println("Write");
        Scanner sc = new Scanner(System.in);
        
        String s="";
        try
        {
            File f = new File("Student.txt");
            if(f.createNewFile())
            {
                FileOutputStream fos = new FileOutputStream(f);
                System.out.println("File Created");
                String head = "Name\tRollNo\tDept";
                byte b[]=head.getBytes();
                fos.write(b);
                fos.close();
            }
            else{
           FileInputStream fis = new FileInputStream(f);
           int val = fis.read();
           while(val!=-1)
           {
            s+=(char)val;
            val=fis.read();
           }
           s+="\n";
          
           FileOutputStream fos = new FileOutputStream("Student.txt");
           String newString = sc.nextLine();
           s+=newString;
           byte b[]=s.getBytes();
           fos.write(b);
           fos.close();
           System.out.println("Write Successfully");
            }
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
    }
    public static void read()
    {
       
        try
        {
           FileInputStream fis = new FileInputStream("Student.txt");
           int val = fis.read();
           while(val!=-1)
           {
               System.out.print((char)val);
               val=fis.read();
           }
            System.out.println();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found\nCreate a file first");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Write\n2:Read");
        
        int opt = sc.nextInt();
        switch(opt)
        {
            case 1:
                write();
                break;
            case 2:
                read();
                break;
        }
        
	    
    }
    
}
