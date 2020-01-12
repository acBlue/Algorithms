package org.ac.graph.path;

import org.ac.base.Node;
import org.ac.graph.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstPaths implements Paths {

    private boolean[] marked;//这个顶点掉用过dfs了吗

    private int[] edgeTo;// 从起点到已知路径的最后一个点

    private final int s; //起点

    public DepthFirstPaths(Graph graph, int s) {

        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.s = s;

        dfs(graph, s);
    }

    private void dfs(Graph graph, int s) {

        marked[s] = true;

        for (int w : graph.adj(s)) {
            if (!marked[w]) {
                edgeTo[w] = s;
                dfs(graph, w);
            }
        }


    }

    @Override
    public boolean hasPathto(int v) {
        return marked[v];
    }

    @Override
    public Iterable<Integer> pathTo(int v) {

        if (!hasPathto(v)) return null;

        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);

        path.push(s);

        List<Integer> list = new LinkedList<>();
       while(!path.empty()){
           list.add(path.pop());
       }

        return list;
    }
}
