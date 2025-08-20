/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap three number");
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Nhap y: ");
        int y = sc.nextInt();
        System.out.print("Nhap z: ");
        int z = sc.nextInt();
        int max = x;
        if(y > max){
            max = y;
        }
        if(z > max){
            max = z;
        }
        System.out.println("So lon nhat trong 3 so la: " + max);
    }
}
