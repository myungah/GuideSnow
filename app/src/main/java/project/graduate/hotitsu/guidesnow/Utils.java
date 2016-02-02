package project.graduate.hotitsu.guidesnow;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static class Graph{
        List<Edge> edges;

        public Graph() {
            edges = new ArrayList<>();
        }

        public void add(Edge Object) {
            edges.add(Object);
        }

        public void add(int location, Edge Object) {
            edges.add(location, Object);
        }

        public Edge getList(int location) {
            return edges.get(location);
        }

        public int size(){
            return edges.size();
        }

        public List<Edge> returnList() {
            return edges;
        }
    }


    public static class Edge {
        int id, cost;

        public Edge(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
    }
}
