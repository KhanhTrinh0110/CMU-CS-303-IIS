/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so chan hoac le: ");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println(x + " la so chan");
        } else{
            System.out.println(x + " la so le");
        }
    }
}
