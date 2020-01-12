package org.ac.graph;

import org.ac.base.Bag;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Graph {

    private final int V;

    private int E;

    private Bag<Integer>[] adj;


    public Graph(int v) {
        this.V = v;
        this.E = 0;
        adj = new Bag[V];
        for (int i = 0; i < this.V; i++) {
            adj[i] = new Bag<Integer>();
        }
    }


    public Graph(int init ,  List<Integer> list) {
        this(init);

        for (int i = 0; i <list.size(); ) {
            int v  = list.get(i++);
            int w = list.get(i++);
            addEdge(v,w);
        }

    }

    public Graph(InputStream in) {
        this(1);
    } 

    public int V() {
        return this.V;
    }

    public int E() {
        return this.E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }


    public Iterable<Integer> adj(int v) {
        return adj[v];
    }


    @Override
    public String toString() {
        return "Graph{" +
                "V=" + V +
                ", E=" + E +
                ", adj=" + Arrays.toString(adj) +
                '}';
    }

    /**
     * 计算V的读书
     *
     * @param graph
     * @param v
     * @return
     */
    public static int degree(Graph graph, int v) {
        int degree = 0;

        for (int w : graph.adj(v)) {
            degree++;
        }
        return degree;
    }

    /**
     * 计算所有顶点的最大度数
     *
     * @param graph
     * @return
     */
    public static int maxDegree(Graph graph) {
        int max = 0;

        for (int v = 0; v < graph.V(); v++)
            if (degree(graph, v) > max)
                max = degree(graph, v);

        return max;
    }

    /**
     * 计算所有顶点的平均度数
     *
     * @param graph
     * @return
     */
    public static double avgDegree(Graph graph) {
        return 2.0 * graph.E() / graph.V();
    }

    /**
     * 计算自环个数
     *
     * @param graph
     * @return
     */
    public static int numberOfSelfLoops(Graph graph) {
        int count = 0;
        for (int v = 0; v < graph.V(); v++)
            for (int w : graph.adj(v))
                if (w == v) count++;


        return count / 2;
    }


}
