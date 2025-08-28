/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6EX;
import java.util.ArrayList;
import java.util.Scanner;
public class bai12 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + freq[i]);
            }
        }
    }
}
