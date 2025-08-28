/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6EX;
import java.util.ArrayList;
import java.util.Scanner;
public class bai14 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
