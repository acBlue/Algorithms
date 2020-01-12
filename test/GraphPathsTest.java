import org.ac.graph.Graph;
import org.ac.graph.path.BreadthFirstPaths;
import org.ac.graph.path.Paths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphPathsTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(0, 5, 2, 4, 2, 3, 1, 2, 0, 1, 3, 4, 3, 5, 0, 2));

        Graph graph = new Graph(6, list);
        System.out.println(graph.toString());

        int s = 0;

        //Paths paths = new DepthFirstPaths(graph, s);
          Paths paths = new BreadthFirstPaths(graph, s);

        for (int v = 0; v < graph.V(); v++) {
            System.out.print(s + " to " + v + ": ");
            if (paths.hasPathto(v)) {
                for (int x : paths.pathTo(v)) {
                    if (x == s) {
                        System.out.print(x);
                    } else {
                        System.out.print("-" + x);
                    }
                }


                System.out.println();
            }

        }


    }
}
