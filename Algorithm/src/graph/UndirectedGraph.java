package graph;

public class UndirectedGraph {
	
	private int count;
	private int[][] vertexMatrix;
	
	public UndirectedGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEdge(int from, int to , int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	} 
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
	
}
