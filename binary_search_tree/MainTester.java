package com.week2;

public class MainTester {
    public static void main(String[]args){
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(5);
        bst.insert(14);
        bst.insert(8);
        bst.insert(3);
        bst.insert(11);
        bst.insert(10);
        System.out.println(bst);

        // System.out.println(bst.search(10));
        // System.out.println(bst.search(3));
        // System.out.println(bst.search(12));

        System.out.println(bst.delete(3));
        System.out.println(bst.delete(5));
        // System.out.println(bst.delete(8));
        // System.out.println(bst.delete(10));
        // System.out.println(bst.delete(11));
        // System.out.println(bst.delete(14));

        System.out.println(bst);
    }
}