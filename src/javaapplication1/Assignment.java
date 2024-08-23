package javaapplication1;
import java.util.Scanner;


public class Assignment{
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("nhap ten :");
        String sentence=keyboard.nextLine();
     
        System.out.println("nhap tuoi :");
        int tuoi=keyboard.nextInt();
       
        System.out.println("nhap nam sinh :");
        int namsinh=keyboard.nextInt();
       
        System.out.println("nhap gioi tinh :");
        String gioitinh=keyboard.next();
        keyboard.nextLine();
       
        System.out.println("nhap chuyen nganh :");
        String chuyennganh=keyboard.nextLine();
       
        System.out.println("nhap gpa :");
        float gpa=keyboard.nextFloat();
        keyboard.nextLine();
       
        System.out.println("nhap que quan :");
        String quequan=keyboard.nextLine();
       
        System.out.println("ten la "+sentence);
        System.out.println("tuoi la "+tuoi);
        System.out.println("nam sinh la "+namsinh);
        System.out.println("gioi tinh la "+gioitinh);
        System.out.println("chuyen nganh "+chuyennganh);
        System.out.println("gpa la "+gpa);
        System.out.println("que quan la "+quequan);
        
        System.out.println("nhap  :");
        boolean nhap = keyboard.hasNext();
        System.out.println(nhap);
        
        System.out.println("so :");
        boolean sen=keyboard.hasNextInt();
        System.out.println(sen);
    }
   
}