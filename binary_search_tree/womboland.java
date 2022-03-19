package com.week2;

import java.util.Scanner;

public class womboland {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        BinarySearchTree<Integer> bstWomboland = new BinarySearchTree<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            bstWomboland.insert(data);
        }
        int bykPair = sc.nextInt();
        for (int i = 0; i < bykPair; i++) {
            int data1 = sc.nextInt();
            System.out.println(bstWomboland.search(data1));
            int data2 = sc.nextInt();
            System.out.println(bstWomboland.search(data2));
        }
    }
}