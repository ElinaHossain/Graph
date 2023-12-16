public class Driver {

    public static void main(String[] args) {
        // Pick String type for the Graph class (Strings can represent cities)
        Graph<String> graph = new Graph<>(5);

        // Add 5 vertices
        graph.addVertex("LA");
        graph.addVertex("SD");
        graph.addVertex("SF");
        graph.addVertex("SIM");
        graph.addVertex("SUNV");

        // Add edges between each vertex
        graph.addEdge("LA", "SD", 1);
        graph.addEdge("SD", "SF", 2);
        graph.addEdge("SF", "SIM", 3);
        graph.addEdge("SIM", "SUNV", 4);
        graph.addEdge("SUNV", "LA", 5); 

        // Call isEmpty
        System.out.println("Is the graph empty? " + graph.isEmpty());

        // Call isFull
        System.out.println("Is the graph full? " + graph.isFull());

        // Call hasVertex for 2 vertices (this checks to see if a particular vertex exists in the Graph, pick any)
        System.out.println("Does the graph have vertex 'LA'? " + graph.hasVertex("A"));
        System.out.println("Does the graph have vertex 'TO'? " + graph.hasVertex("TO"));

        // Call weightIs for 3 vertices (pick any)	
        System.out.println("Weight between LA and SD: " + graph.weightIs("LA", "SD"));
        System.out.println("Weight between SD and SF: " + graph.weightIs("SD", "SF"));
        System.out.println("Weight between SF and SIM: " + graph.weightIs("SF", "SIM"));

        // Call printGraph (this should print out all the vertices array and the 2D edges array which shows the weights between the vertices)
        graph.printGraph();
    }
}






	
	