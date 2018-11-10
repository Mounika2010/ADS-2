import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...
		Scanner scan = new Scanner(System.in);
		int vertices = Integer.parseInt(scan.nextLine());
		int edges = Integer.parseInt(scan.nextLine());
		Digraph digraph = new Digraph(vertices);
		for (int i = 0; i < vertices; i++) {
			String[] arr = scan.nextLine ().split(" ");
			if (arr.length == 1) {
				for (int j = 0; j < vertices; j++) {
					digraph.addEdge(i, j);
				}
			} else {
				for (int j = 1; j < arr.length; j++) {
					digraph.addEdge(Integer.parseInt(arr[0]), Integer.parseInt(arr[j]));
				}
			}	
		}
       
		String caseToGo = scan.nextLine();
		
		switch (caseToGo) {
		case "Graph":
			//Print the Graph Object.
			System.out.println(digraph);
		
			break;
		

		case "DirectedPaths":
			// Handle the case of DirectedPaths, where two integers are given.
			// First is the source and second is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		case "ViaPaths":
			// Handle the case of ViaPaths, where three integers are given.
			// First is the source and second is the via is the one where path should pass throuh.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		default:
			break;
		
	// } catch (Exception ex) {
	// 	System.out.println(ex.getMessage());
	}

	}
}