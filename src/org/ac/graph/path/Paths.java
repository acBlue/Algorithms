package org.ac.graph.path;

public interface Paths {

    boolean hasPathto(int v);

    Iterable<Integer> pathTo(int v);

}
