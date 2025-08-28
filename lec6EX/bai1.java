/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6EX;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu trong mang: ");
        int n = sc.nextInt();
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("a[" + (i + 1) + "] = ");
            temp[i] = sc.nextInt();
        }
        int max = temp[0];
        int min = temp[0];
        for(int i = 1; i < n; i++){
            if(temp[i] > max){
                max = temp[i];
            }
            if(temp[i] < min){
                min = temp[i];
            }
        }
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }
}
