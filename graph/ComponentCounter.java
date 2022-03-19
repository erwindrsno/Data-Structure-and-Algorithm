package com.modul;

class ComponentCounter {
    int component;
    int[][] matrix;
    boolean[] isVisited;
    int N;

    public ComponentCounter(int N, int matrix[][]) {
        component = 0;
        this.matrix = matrix;
        this.N = N;
        isVisited = new boolean[N];
        for (int i = 0; i < matrix.length; i++) {
            isVisited[i] = false;
        }
    }

    public int count() {
        for (int i = 0; i < N; i++) {
            // System.out.println(i + " " + isVisited[i]);
            if (isVisited[i] == false) {
                component += 1;
                dfsRecursive(i);
            }
        }
        return component;
    }

    public void dfsRecursive(int vertex){
        isVisited[vertex] = true;
        // process(vertex);
        int j = 0;
        while(j<N){
            if(matrix[vertex][j] > 0){
                if(isVisited[j]==false){
                    dfsRecursive(j);
                }
            }
            j++;
        }
    }
    // public void process(int x){
    // System.out.println(x+" ");
    // }
}
