package dsa;

import java.util.*;

class Kruska {
	static class Edge {
		int src, dest, weight;

		Edge(int src, int dest, int weight) {
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}

	static class DisjointSet {
		int[] parent, rank;

		DisjointSet(int n) {
			parent = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}

		int find(int i) {
			if (parent[i] != i) {
				parent[i] = find(parent[i]);
			}
			return parent[i];
		}

		void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX != rootY) {
				if (rank[rootX] < rank[rootY]) {
					parent[rootX] = rootY;
				} else if (rank[rootX] > rank[rootY]) {
					parent[rootY] = rootX;
				} else {
					parent[rootY] = rootX;
					rank[rootX]++;
				}
			}
		}
	}

	public static List<Edge> kruskalMST(int vertices, List<Edge> edges) {
		List<Edge> result = new ArrayList<>();
		Collections.sort(edges, Comparator.comparingInt(e -> e.weight));
		DisjointSet ds = new DisjointSet(vertices);
		for (Edge edge : edges) {
			int rootSrc = ds.find(edge.src);
			int rootDest = ds.find(edge.dest);

			if (rootSrc != rootDest) {
				result.add(edge);
				ds.union(rootSrc, rootDest);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int vertices = 4;
		List<Edge> edges = new ArrayList<>();
		edges.add(new Edge(0, 1, 10));
		edges.add(new Edge(0, 2, 6));
		edges.add(new Edge(0, 3, 5));
		edges.add(new Edge(1, 3, 15));
		edges.add(new Edge(2, 3, 4));

		List<Edge> mst = kruskalMST(vertices, edges);

		System.out.println("Edges in the Minimum Spanning Tree (Kruskal's):");
		for (Edge edge : mst) {
			System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
		}
	}
}
