/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai 3 canh: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if(x + y > z && x + z > y && y + z > x){
            if(x == y && y == z){
                System.out.println("This is an equilateral triangle.");
            } else if(x == y && y == z && z == x){
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle. ");
        }
    }
}
