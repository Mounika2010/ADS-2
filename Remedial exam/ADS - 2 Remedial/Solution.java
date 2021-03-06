import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String[] nk = scan.nextLine().split(" ");
		int edges = Integer.parseInt(nk[0]);
		int vertices = Integer.parseInt(nk[1]);
        EdgeWeightedGraph edgewgraph = new EdgeWeightedGraph(vertices);
        while(scan.hasNext()) {
        	String[] xyz = scan.nextLine().split(" ");
        	edgewgraph.addEdge(new Edge(Integer.parseInt(xyz[0])-1, Integer.parseInt(xyz[1])-1, Double.parseDouble(xyz[2])));
        }
        KruskalMST krushkal = new KruskalMST(edgewgraph);
        System.out.format("%.0f", krushkal.totalWeight());
        for (Edge each: krushkal.edges()){
        	int v = each.either();
        	int edge = each.other(v);
        	int a = v + 1;
        	int b = edge + 1;
        System.out.println(a + "-"+b);

        }


	}
}