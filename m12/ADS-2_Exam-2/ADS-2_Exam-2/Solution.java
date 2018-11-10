import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...

		Scanner scan = new Scanner(System.in);
		int vertices = Integer.parseInt(scan.nextLine());
		int edges = Integer.parseInt(scan.nextLine());
		System.out.println(vertices + " " + "vertices" + " " + edges + " " + "edges");
		EdgeWeightedGraph edgewgraph = new EdgeWeightedGraph(vertices);
		for (int i = 0; i < edges; i++) {

			String[] arr = scan.nextLine().split(" ");
			Edge edge = new Edge(Integer.parseInt(arr[0]),
			                     Integer.parseInt(arr[1]),
			                     Double.parseDouble(arr[2]));
			edgewgraph.addEdge(edge);

		}





		String caseToGo = scan.nextLine();

		switch (caseToGo) {
		case "Graph":
			//Print the Graph Object.
			System.out.println(edgewgraph.toString());

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