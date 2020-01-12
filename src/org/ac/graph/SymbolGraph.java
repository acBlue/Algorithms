package org.ac.graph;

import java.util.HashMap;
import java.util.List;

public class SymbolGraph {

    private HashMap<String, Integer> st;

    private String[] keys;

    private Graph g;


    public SymbolGraph(List<String> data) {
        st = new HashMap<>();

        for (int i = 0; i < data.size(); i++) {
            if (!st.containsKey(data.get(i)))
                st.put(data.get(i), i);
        }

        keys = new String[st.size()];

        st.keySet().forEach(key -> {
            keys[st.get(key)] = key;
        });

        g = new Graph(st.size());



    }
}
