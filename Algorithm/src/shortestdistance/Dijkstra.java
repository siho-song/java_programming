package shortestdistance;

import graph.UndirectedGraph;

public class Dijkstra {
	private static final int INF = 1000000;
	public boolean[] visited;
	public int[] distance;
	public int[][] matrix;
	public int count;
	public int start;
	
	public Dijkstra(int count, int[][] matrix, int start) {
		this.visited = new boolean[count];
		this.distance = new int[count];
		this.matrix = matrix; 
		this.count = count;
		this.start = start;
	}
	
	public void dijkstra() {
		
		int from = start;
		
		for(int i=0 ; i<count ; i++) {
			distance[i] = INF;
		}
		
		
		visited[from] = true;
		distance[from] = 0;
		
		for(int i=0; i<count; i++) {
			if(visited[from] == true && matrix[from][i] != 0) {
				distance[i] = matrix[from][i];
			}
		}
		
		for(int i=0 ; i<count-1 ;i++) {
			int min = INF;
			int minIndex = -1;
			
			for(int j=0 ;j<count ;j++) {
				if(distance[j] != INF && visited[j] ==false) {
					if(min>distance[j]) {
						min = distance[j];
						minIndex = j;
					}
				}
			}
			
			visited[minIndex] = true;
			
			for(int j=0 ; j<count ;j++) {
				if(visited[j] == false && matrix[minIndex][j] != 0) {
					if(distance[j] > distance[minIndex]+matrix[minIndex][j]) {
						distance[j] = distance[minIndex]+matrix[minIndex][j];
					}
				}
			}
		}
		
		printDistance();
	}
	
	public void printDistance() {
		for(int i =0;i<count ;i++) {
			System.out.println(start+"번 노드에서 "+ i+"번 노드까지의 최단거리는 "+distance[i]+"입니다.");
		}
	}
		
		
	

	public static void main(String[] args) {
		int count = 6;
		UndirectedGraph graph = new UndirectedGraph(count);
		graph.addEdge(0, 1, 1);
		graph.addEdge(0, 2, 4);
		graph.addEdge(1, 2, 2);
		graph.addEdge(2, 3, 1);
		graph.addEdge(3, 4, 8);
		graph.addEdge(3, 5, 3);
		graph.addEdge(4, 5, 4);
		
		Dijkstra dijkstra = new Dijkstra(count,graph.getMatrix(),0);
		dijkstra.dijkstra();

	}

}
