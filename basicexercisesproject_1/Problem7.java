/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisesproject_1;

import java.util.Scanner;

/**
 *
 * @author User8
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number:  ");
	  int number = sc.nextInt();
          
          for (int i = 1; i < 11; i++) {
              System.out.println(number + " x " + i + " = " + (number*i));
            
        }
    }
    
}
