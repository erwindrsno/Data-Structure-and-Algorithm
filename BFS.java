package com.modul;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    Queue<Integer> q1;
    boolean[] isVisited;
    int[][] matrix;
    int[] arrOrder;
    int[] arrParent;
    int ctr;
    int N;

    public BFS(int N, int[][] matrix){
        q1 = new LinkedList<>();
        isVisited = new boolean[N];
        for (int i = 0; i < N; i++) {
            isVisited[i] = false;
        }
        arrOrder = new int[N];
        arrParent = new int[N];
        ctr = 0;
        this.matrix = matrix;
        this.N = N;
    }

    public void traverse(){
        for (int i = 0; i < this.N; i++) {
            if(isVisited[i] == false){
                q1.offer(i);
                arrOrder[i] = ctr;
                isVisited[i] = true;
                while(q1.isEmpty() == false){
                    int a = q1.poll();
                    process(a);
                    for (int j = 0; j < N; j++) {
                        if(isVisited[i] == false){
                            arrParent[j] = a;
                            arrOrder[a] = ctr;
                            ctr += 1;
                            isVisited[j] = true;
                            q1.offer(j);
                        }
                    }
                }
            }
        }
    }

    public void process(int a){
        System.out.print(a +" ");
    }
}
