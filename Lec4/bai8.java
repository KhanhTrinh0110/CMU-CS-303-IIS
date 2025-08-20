/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x va y: ");
        int x = sc.nextInt(), y = sc.nextInt();
        if(x > 0 && y < 0){
            System.out.println("The point is in 1st quadrant!");
        } else if(x < 0 && y > 0){
            System.out.println("The point is in 2nd quadrant!");
        } else if(x < 0 && y < 0){
            System.out.println("The point is in 3nd quadrant!");
        } else if(x > 0 && y > 0){
            System.out.println("The point is in 4nd quadrant!");
        } else if(x == 0 || y == 0){
            System.out.println("The point is on an axis!");
        }
    }
}
