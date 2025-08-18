/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisesproject_1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem11 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Date of Birth: ");
        String dob = sc.nextLine();
        
        System.out.print("Address: ");
        String address = sc.nextLine();
        
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Course: ");
        String course = sc.nextLine();
        
        System.out.print("Year Level: ");
        int yearlevel = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Secondary School Graduated: ");
        String school = sc.nextLine();
        
         System.out.print("Year: ");
        int year = sc.nextInt();
        
        System.out.print("===========================");
        System.out.print("Personal Info");
        System.out.println("===========================");
        
        System.out.println("NAME: "+ name);
        System.out.println("DATE OF BIRTH: "+ dob);
        System.out.println("ADDRESS: "+ address);
        System.out.println("AGE: "+ age);
        System.out.println("COURSE: "+ course);
        System.out.println("YEAR LEVEL: "+ yearlevel);
        
        System.out.print("===========================");
        System.out.print("EDUCATIONAL INFO");
        System.out.println("===========================");
        
        System.out.println("SECONDARY LEVEL");
        System.out.println("NAME OF SCHOOL: "+ school);
        System.out.println("YEAR: "+ year);
    }
}
