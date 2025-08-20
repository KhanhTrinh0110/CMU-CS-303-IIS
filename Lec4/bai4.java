/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Nhap y: ");
        int y = sc.nextInt();
        System.out.print("Nhap +,-,/ : ́");
        char z = sc.next().charAt(0);
        switch(z){
            case '+' : System.out.println("x + y = " + (x+y)); break;
            case '-' : System.out.println("x - y = " + (x-y)); break;
            case '*' : System.out.println("x * y = " + (x*y)); break;
            case '/' : System.out.println("x / y = " + (x/y)); break;
            default : System.out.println("Phep tinh nay khong ton tai!");
        }
    }
}
