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
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Integers: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int temp = number;
        
        while ( temp != 0){
            sum += temp % 10;
            temp /= 10;
               }
               System.out.println(" the sum number of digit is: "+ sum);
    }
    
}
