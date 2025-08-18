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
public class Problem9 {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        System.out.print("Input a 1st number:  ");
        int a = sc.nextInt();
         System.out.print("Input a 2nd number:  ");
        int b = sc.nextInt();
         System.out.print("Input a 3rd number:  ");
        int c = sc.nextInt();
        
        double average = (a+b+c) / 3.0;
        System.out.println("average: "+ average);
    }
    
}
