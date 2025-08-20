/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.controlstructures_exercise1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem7 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
      int sum = 0, number;
        if (number != sum) {
            System.out.println("Invalid number");
        }
      
        do {
            System.out.println("Enter a Number: ");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("Sum: "+ (sum - 0));
          
    }
}
