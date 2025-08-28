/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6EX;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cac phan tu cua mang: ");
        int n = sc.nextInt();
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + (i + 1) + "] = ");
            temp[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau: ");
        for(int i = 0; i < n; i++){
            System.out.print(temp[i] + " ");
        }
        int daonguoc = 0;
        for(int i = 0; i < temp.length / 2; i++){
            daonguoc = temp[i];
            temp[i] = temp[temp.length - 1 - i];
            temp[temp.length - 1 - i] = daonguoc;
        }
        System.out.print("Mang sau khi dao nguoc: ");
        for(int i = 0; i < n; i++){
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}
