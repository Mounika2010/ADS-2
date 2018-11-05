import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vertices = Integer.parseInt(s.nextLine());
		Digraph graph = new Digraph(vertices);
		for(int i = 0; i < vertices; i++) {
			String[] array = s.nextLine().split(" ");
			if(array.length == 1) {
				for(int j = 0; j < vertices; j++) {
					graph.addEdge(i,j);
				}
			}
			else {
					for(int j = 1; j < array.length; j++) {

						graph.addEdge(Integer.parseInt(array[0]),Integer.parseInt(array[j]));
					}	
			}
			
		}
	}	
}