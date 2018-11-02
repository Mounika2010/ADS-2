import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String synsetsFile = scan.nextLine();
		String hypernymFile = scan.nextLine();
		String line = scan.nextLine();
		WordNet words = new WordNet("Files/" + synsetsFile, "Files/" + hypernymFile);
		switch (line) {
			case "Graph":
			break;
			case "Queries":
			break;
			default:
			break;
		}
	}
}