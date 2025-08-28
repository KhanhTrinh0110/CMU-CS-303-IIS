/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6EX;
import java.util.ArrayList;
import java.util.Scanner;
public class bai6 {
        public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Nhap so nguyen (nhap -1 de dung):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            numbers.add(num);
            sum += num;
        }
        System.out.println("Cac so da nhap: " + numbers);
        System.out.println("Tong cac so: " + sum);
    }
}
