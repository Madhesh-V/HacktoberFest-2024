#include<bits/stdc++.h>
using namespace std;

typedef pair<int,int> pii;

// Function to find sum of weights of edges of the Minimum Spanning Tree.
int spanningTree(int V, int E, int edges[][3])
{ 
	// Create an adjacency list representation of the graph
	vector<vector<int>> adj[V];
	
	// Fill the adjacency list with edges and their weights
	for (int i = 0; i < E; i++) {
		int u = edges[i][0];
		int v = edges[i][1];
		int wt = edges[i][2];
		adj[u].push_back({v, wt});
		adj[v].push_back({u, wt});
	}
	
	// Create a priority queue to store edges with their weights
	priority_queue<pii, vector<pii>, greater<pii>> pq;
	
	// Create a visited array to keep track of visited vertices
	vector<bool> visited(V, false);
	
	// Variable to store the result (sum of edge weights)
	int res = 0;
	
	// Start with vertex 0
	pq.push({0, 0});
	
	// Perform Prim's algorithm to find the Minimum Spanning Tree
	while(!pq.empty()){
		auto p = pq.top();
		pq.pop();
		
		int wt = p.first; // Weight of the edge
		int u = p.second; // Vertex connected to the edge
		
		if(visited[u] == true){
			continue; // Skip if the vertex is already visited
		}
		
		res += wt; // Add the edge weight to the result
		visited[u] = true; // Mark the vertex as visited
		
		// Explore the adjacent vertices
		for(auto v : adj[u]){
			// v[0] represents the vertex and v[1] represents the edge weight
			if(visited[v[0]] == false){
				pq.push({v[1], v[0]}); // Add the adjacent edge to the priority queue
			}
		}
	}
	
	return res; // Return the sum of edge weights of the Minimum Spanning Tree
}

int main()
{
	int graph[][3] = {{0, 1, 5},
					{1, 2, 3},
					{0, 2, 1}};

	// Function call
	cout << spanningTree(3, 3, graph) << endl;

	return 0;
}
