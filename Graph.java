package com.modul;

class Graph {
    int N; //number of vertices
    int[][] matrix;


    public Graph(int N){
        this.N = N;
        this.matrix = new int[N][N];
    }

    public void addEdge(int v1, int v2){
        this.matrix[v1][v2] = 1;
        this.matrix[v2][v1] = 1;
    }

    public void addEdge(int v1, int v2, int bobot){
        this.matrix[v1][v2] = bobot;
        this.matrix[v2][v1] = bobot;
    }

    public void removeEdge(int v1, int v2){
        this.matrix[v1][v2] = 0;
        this.matrix[v2][v1] = 0;
    }

    public int isEdgeExist(int v1, int v2){
        return this.matrix[v1][v2];
    }

    public void countComponent(){
        ComponentCounter cc1 = new ComponentCounter(this.N,this.matrix);
        System.out.println(cc1.count());
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < N; i++) {
            s.append(i + ": ");
            for (int j = 0; j < N; j++) {
                s.append((this.matrix[i][j] > 0 ? this.matrix[i][j] : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public void BFS(){
        BFS bfs1 = new BFS(this.N,this.matrix);
        bfs1.traverse();
    }
}