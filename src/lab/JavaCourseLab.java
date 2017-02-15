/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author ChiNguyen
 */
public class JavaCourseLab {
    private static char sex;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(0b10 + 0b11);
        // Check if a number is add or even
        int a = new Scanner(System.in).nextInt();
        if((a & 1) == 1) System.out.println("The number is odd");
        if((a & 1) == 0) System.out.println("The number is even");
        System.out.println("Changed");
    }
    
    
}


