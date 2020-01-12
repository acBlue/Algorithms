import org.ac.graph.Graph;
import org.ac.graph.search.DepthFirstSearch;
import org.ac.graph.search.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphSearchTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(0,5,2,4,2,3,1,2,0,1,3,4,3,5,0,2));

        Graph graph = new Graph(6,list);
        System.out.println(graph.toString());
        Search search = new DepthFirstSearch(graph,0);

        for (int v = 0; v<graph.V();v++){
            if (search.marked(v))
                System.out.print(v+" ");

            System.out.println();

            if (search.count() != graph.V())
                System.out.print("Not ");

            System.out.println("connected");

        }

    }

}
