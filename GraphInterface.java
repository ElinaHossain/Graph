public interface GraphInterface<T> {

	public void addVertex(T vertex);
	public void addEdge(T fromVertex, T toVertex, int weight);
	
	public boolean isEmpty();
	public boolean isFull();
	
	public boolean hasVertex(T vertex); //checks to see if Vertex exists in Graph
	public int weightIs(T fromVertex, T toVertex);
	
	public void printGraph(); // print all vertices and the edges array which indicates weights from/to vertices

}