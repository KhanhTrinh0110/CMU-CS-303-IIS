/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tuoi nguoi dung: ");
        int age = sc.nextInt();
        if(0 < age && age <= 12){
            System.out.println("Child");
        } else if(13 <= age && age <= 19){
            System.out.println("Teenager");
        } else if(20 <= age && age <= 59){
            System.out.println("Adult");
        } else if(age >= 60){
            System.out.println("Senior");
        }
    }
}
