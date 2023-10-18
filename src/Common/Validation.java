/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Validation {
    Scanner sc = new Scanner(System.in);
    public double inputDouble(String mess, double min) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                double number = Double.parseDouble(input);
                if (number <= min) {
                    System.out.print("Please input greater than " + min + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an double number: ");
            }
        }
    }

}
