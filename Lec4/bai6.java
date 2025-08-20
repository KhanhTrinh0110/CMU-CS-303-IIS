/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap averge score: ");
        double x = sc.nextDouble();
        if(9.0 <= x && x <= 10){
            System.out.println("Excellent");
        } else if(8.0 <= x && x <= 8.9){
            System.out.println("Good");
        } else if(6.5 <= x && x <= 7.9){
            System.out.println("Fair");
        } else if(5.0 <= x && x <= 6.4){
            System.out.println("Average");
        } else if(x < 5.0){
            System.out.println("Fail");
        }
    }
}
