/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6EX;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class bai15 {
        public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        sc.nextLine(); 
        String[] arr = new String[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextLine();
        }
        ArrayList<String> list1 = arrayToArrayList(arr);
        System.out.println("ArrayList: " + list1);

        int n2 = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextLine());
        }
        String[] arr2 = arrayListToArray(list2);
        System.out.println("Array: " + Arrays.toString(arr2));
    }
}

