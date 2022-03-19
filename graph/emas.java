package com.modul;

import java.util.Scanner;
import java.util.Stack;

public class emas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int bykGua = sc.nextInt();
            char[] arrGua = new char[bykGua];
            for (int j = 0; j < arrGua.length; j++) {
                arrGua[j] = Character.toUpperCase(sc.next().charAt(0));
            }
            Graph jaringanTerowongan = new Graph(bykGua);
            int jlhTerowongan = sc.nextInt();
            for(int k = 0; k < jlhTerowongan; k++){
                //char temp1 = 'A';
                //int temp = temp1; //agar edge yang diterima dapat berubah mulai dari index 0 di adjacency matrix
                int terow1 = indexOf(Character.toUpperCase(sc.next().charAt(0)),arrGua);
                int terow2 = indexOf(Character.toUpperCase(sc.next().charAt(0)),arrGua);
                jaringanTerowongan.addEdge(terow1,terow2);
//                System.out.println(terow1 +" " + terow2);
            }
            //System.out.println(jaringanTerowongan.toString());
            jaringanTerowongan.countComponent();
        }
    }
    
    public static int indexOf(char input, char[] arrGua){
        for (int i = 0; i < arrGua.length; i++) {
            if(input == arrGua[i]){
                return i;
            }
        }
        return 0;
    }
}

// class Graph {
//     int N; //number of vertices
//     int[][] matrix;


//     public Graph(int N){
//         this.N = N;
//         this.matrix = new int[N][N];
//     }

//     public void addEdge(int v1, int v2){
//         this.matrix[v1][v2] = 1;
//         this.matrix[v2][v1] = 1;
//     }

//     public void addEdge(int v1, int v2, int bobot){
//         this.matrix[v1][v2] = bobot;
//         this.matrix[v2][v1] = bobot;
//     }

//     public void removeEdge(int v1, int v2){
//         this.matrix[v1][v2] = 0;
//         this.matrix[v2][v1] = 0;
//     }

//     public int isEdgeExist(int v1, int v2){
//         return this.matrix[v1][v2];
//     }

//     public void countComponent(){
//         ComponentCounter cc1 = new ComponentCounter(this.N,this.matrix);
//         System.out.println(cc1.count());
//     }

//     @Override
//     public String toString(){
//         StringBuilder s = new StringBuilder();
//         for (int i = 0; i < N; i++) {
//             s.append(i + ": ");
//             for (int j = 0; j < N; j++) {
//                 s.append((this.matrix[i][j] > 0 ? this.matrix[i][j] : 0) + " ");
//             }
//             s.append("\n");
//         }
//         return s.toString();
//     }
// }

// class ComponentCounter {
//     int component;
//     int[][] matrix;
//     boolean[] isVisited;
//     int N;

//     public ComponentCounter(int N, int matrix[][]) {
//         component = 0;
//         this.matrix = matrix;
//         this.N = N;
//         isVisited = new boolean[N];
//         for (int i = 0; i < matrix.length; i++) {
//             isVisited[i] = false;
//         }
//     }

//     public int count() {
//         for (int i = 0; i < N; i++) {
//             // System.out.println(i + " " + isVisited[i]);
//             if (isVisited[i] == false) {
//                 component += 1;
//                 dfsRecursive(i);
//             }
//         }
//         return component;
//     }

//     public void dfsRecursive(int vertex){
//         isVisited[vertex] = true;
//         // process(vertex);
//         int j = 0;
//         while(j<N){
//             if(matrix[vertex][j] > 0){
//                 if(isVisited[j]==false){
//                     dfsRecursive(j);
//                 }
//             }
//             j++;
//         }
//     }
    // public void process(int x){
    // System.out.println(x+" ");
    // }
// }
