import java.util.*;

class Node {
    String val;
    Node(String val) {
        this.val = val;
    }
}

class Graph {
    HashMap<Node, ArrayList<Node>> adjList;

    Graph(List<Node> nodes){
        this.adjList = new HashMap<Node, ArrayList<Node>>();
        for(Node n: nodes){
            adjList.put(n, new ArrayList<Node>());
        }
    }

    void addEdge(Node n1, Node n2){
        adjList.get(n1).add(n2);
        adjList.get(n2).add(n1);
    }

    void addDirectedEdge(Node n1, Node n2){
        adjList.get(n1).add(n2);
    }

    void removeEdge(Node n1, Node n2){
        adjList.get(n1).remove(n2);
        adjList.get(n2).remove(n1);
    }

    ArrayList<String> depthFirstSearch(Node start){
        ArrayList<Node> visited = new ArrayList<Node>();
        Stack<Node> stack = new Stack<Node>();

        stack.push(start);

        while(!stack.isEmpty()){
            Node currNode = stack.pop();
            if(!visited.contains(currNode)){
                visited.add(currNode);
                for(Node n: adjList.get(currNode)){
                    stack.push(n);
                }
            }
        }

        ArrayList<String> dfs = new ArrayList<String>();
        for(Node n: visited){
            dfs.add(n.val);
        }

        return dfs;
    }

    void printAdjList() {
        for (Map.Entry mapElement : adjList.entrySet()) {
            Node n = (Node)mapElement.getKey();
            System.out.print(n.val + " -> ");
            ArrayList<Node> list = adjList.get(n);
            for(Node a : list)
                System.out.print(a.val + " ");
            System.out.println("");
        }
    }

}

public class Main{
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node n1 = new Node("Delhi");
        Node n2 = new Node("Bengaluru");
        Node n3 = new Node("Mumbai");
        Node n4 = new Node("Karnataka");
        Node n5 = new Node("Bihar");
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);

        Graph g = new Graph(nodes);

        g.addEdge(n1, n2);
        g.addEdge(n1, n4);
        g.addEdge(n1, n5);
        g.addEdge(n2, n5);
        g.addEdge(n3, n4);

        g.printAdjList();

    }
}
