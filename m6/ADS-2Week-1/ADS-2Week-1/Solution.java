import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {

		// read the first line of the input to get the number of vertices
		Scanner scan = new Scanner(System.in);
		int vertices = Integer.parseInt(scan.nextLine());
		// int edges = Integer.parseInt(scan.nextLine());
		Digraph graph = new Digraph(vertices);
		for (int i = 0; i < vertices; i++) {
			String[] arr = scan.nextLine ().split(" ");
			if(arr.length == 1) {
				for (int j = 0; j < vertices; j++) {
					graph.addEdge(i,j);
				}
			}
			else {
				for (int j = 1; j < arr.length; j++) {
					graph.addEdge(Integer.parseInt(arr[0]), Integer.parseInt(arr[j]));
					
				}
			}
		}
        // PageRank pr = new PageRank(vertices);
		// iterate count of vertices times
		// to read the adjacency list from std input
		// and build the graph


		// Create page rank object and pass the graph object to the constructor

		// print the page rank object

		// This part is only for the final test case

		// File path to the web content
		String file = "WebContent.txt";

		// instantiate web search object
		// and pass the page rank object and the file path to the constructor

		// read the search queries from std in
		// remove the q= prefix and extract the search word
		// pass the word to iAmFeelingLucky method of web search
		// print the return value of iAmFeelingLucky

	}
}
