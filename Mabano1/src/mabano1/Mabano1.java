/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mabano1;

/**
 *
 * @author PC27-COMLAB1
 */
import java.util.*;

public class Mabano1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner deya=new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        float w=deya.nextFloat();
        System.out.print("Enter your height (m): ");
        float h=deya.nextFloat();
        float b=w/(h*h);
        
        if (b < 18.5){
            System.out.println("Underweight");
        }
        else if (b>=18.5 && b<=24.9){
            System.out.println("Normal Weight");
        }
        else if (b >=25.0 && b<=29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obesity");
        }
    }
    
}
