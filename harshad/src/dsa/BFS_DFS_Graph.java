package dsa;

import java.util.*;

public class BFS_DFS_Graph {
	private Map<Integer, List<Integer>> adjList;

	// Constructor
	public BFS_DFS_Graph() {
		adjList = new HashMap<>();
	}

	// Add an edge to the graph (undirected)
	public void addEdge(int u, int v) {
		adjList.putIfAbsent(u, new ArrayList<>());
		adjList.putIfAbsent(v, new ArrayList<>());
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	// BFS Traversal
	public void bfs(int start) {
		Set<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();

		visited.add(start);
		queue.add(start);

		System.out.println("BFS Traversal starting from " + start + ":");
		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");

			for (int neighbor : adjList.get(node)) {
				if (!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.add(neighbor);
				}
			}
		}
		System.out.println();
	}

	// DFS Traversal (using recursion)
	public void dfs(int start) {
		Set<Integer> visited = new HashSet<>();
		System.out.println("DFS Traversal starting from " + start + ":");

		dfsRecursive(start, visited);
		System.out.println();
	}

	// Helper method for DFS (recursive)
	private void dfsRecursive(int node, Set<Integer> visited) {
		visited.add(node);
		System.out.print(node + " ");

		for (int neighbor : adjList.get(node)) {
			if (!visited.contains(neighbor)) {
				dfsRecursive(neighbor, visited);
			}
		}
	}

	// Main method to run the code
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create graph instance
		BFS_DFS_Graph graph = new BFS_DFS_Graph();

		// Input the number of edges
		System.out.print("Enter the number of edges: ");
		int edges = scanner.nextInt();

		System.out.println("Enter the edges (source and destination):");
		for (int i = 0; i < edges; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			graph.addEdge(u, v); // Add edge to the graph
		}

		// Input the starting vertex for BFS and DFS
		System.out.print("Enter the starting vertex for BFS and DFS: ");
		int startVertex = scanner.nextInt();

		// Perform BFS and DFS Traversals
		graph.bfs(startVertex); // Perform BFS
		graph.dfs(startVertex); // Perform DFS

		scanner.close();
	}
}
