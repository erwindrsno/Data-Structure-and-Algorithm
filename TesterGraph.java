package com.modul;

import java.util.Queue;
import java.util.LinkedList;

public class TesterGraph {
    public static void main(String[]args){
        Graph g1 = new Graph(5);
        g1.addEdge(0,1);
        g1.addEdge(2,0);
        g1.addEdge(3,0);
        g1.addEdge(4,0);

        System.out.println(g1.toString());
        //g1.BFS();
        // g1.removeEdge(0,1);
        // System.out.println(g1.toString());

        // System.out.println(g1.isEdgeExist(1,3));
        // System.out.println(g1.isEdgeExist(1,5));
    }
}

