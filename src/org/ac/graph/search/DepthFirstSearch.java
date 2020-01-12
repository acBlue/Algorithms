package org.ac.graph.search;

import org.ac.graph.Graph;

public class DepthFirstSearch implements Search{

    private boolean[] marked;

    private int count;

    public DepthFirstSearch(Graph graph,int s) {
        marked = new boolean[graph.V()];

        dfs(graph,s);

    }

    private void dfs(Graph graph, int s) {

        marked[s] = true;
        count++;
        for (int w :graph.adj(s)){
            if (!marked[w])
                dfs(graph,w);
        }


    }

    @Override
    public boolean marked(int w) {
        return marked[w];
    }

    @Override
    public int count() {
        return count;
    }
}
