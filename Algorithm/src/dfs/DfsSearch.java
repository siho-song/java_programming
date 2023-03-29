package dfs;

import java.util.Stack;

import graph.UndirectedGraph;

public class DfsSearch {
	
	public int count;
	boolean[] visited;
	Stack<Integer> stack;
	int[][] matrix;
	
	public DfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		stack = new Stack<Integer>();
	}
	
	public void dfsTravelsal() {
		
		stack.push(0);
		visited[0] = true;
		
		while(stack.isEmpty() != true) {
			
			int node=stack.pop();
			System.out.print(node+ " ");
			for(int i=0; i<count; i++) {
				if(matrix[node][i] != 0 && (visited[i] == false)) {
					stack.push(i);
					visited[i] = true;
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		graph.addEdge(0, 1, 1);
		graph.addEdge(0, 2, 1);
		graph.addEdge(1, 3, 1);
		graph.addEdge(1, 4, 1);
		graph.addEdge(2, 5, 1);
		graph.addEdge(2, 6, 1);
		graph.addEdge(4, 5, 1);
		graph.addEdge(3, 7, 1);
		
		DfsSearch dfs = new DfsSearch(count);
		dfs.matrix = graph.getMatrix();
		dfs.dfsTravelsal();
		
	}
	
}
