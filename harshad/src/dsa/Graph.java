package dsa;

import java.util.Scanner;

public class Graph {
	private int[][] adjacencyMatrix;
	private int numVertices;

	public Graph(int numVertices) {
		this.numVertices = numVertices;
		adjacencyMatrix = new int[numVertices][numVertices];
	}

	public void addEdge(int source, int destination) {
		if (source < 0 || source >= numVertices || destination < 0 || destination >= numVertices) {
			System.out.println("Invalid vertex: " + source + " or " + destination);
			return;
		}
		adjacencyMatrix[source][destination] = 1;
		adjacencyMatrix[destination][source] = 1;
	}

	public void removeEdge(int source, int destination) {
		adjacencyMatrix[source][destination] = 0;
		adjacencyMatrix[destination][source] = 0;
	}

	public void displayMatrix() {
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of vertices: ");
		int vertices = scanner.nextInt();

		Graph graph = new Graph(vertices);

		System.out.print("Enter the number of edges: ");
		int edges = scanner.nextInt();

		System.out.println("Enter the edges (source and destination):");
		for (int i = 0; i < edges; i++) {
			int source = scanner.nextInt();
			int destination = scanner.nextInt();
			graph.addEdge(source, destination);
		}

		System.out.println("Adjacency Matrix:");
		graph.displayMatrix();

		scanner.close();
	}
}
