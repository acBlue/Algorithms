package org.ac.graph;

import org.ac.base.Bag;

public class Digraph {

    private final int V;

    private int E;

    private Bag<Integer>[] adj;

    public Digraph(int v) {
        this.V = v;
        this.E = 0;
        adj = new Bag[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new Bag<>();
        }
    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public Digraph revserse() {
        Digraph R = new Digraph(V);
        for (int i = 0; i < V; i++)
            for (int w : adj[i])
                R.addEdge(w, i);


        return R;
    }

}
