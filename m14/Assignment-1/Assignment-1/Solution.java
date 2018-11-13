import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = loadWords();
        //Your code goes here...
        String prefixstr = scan.nextLine();
        // SuffixArray suffix = new SuffixArray(prefixstr);
        TST<Integer> tst = new TST<Integer>();
        int j = 0;
        for (String word : words) {
            SuffixArray suffix = new SuffixArray(word);
            for (int i = 0; i < word.length(); i++) {
                tst.put(suffix.select(i), j++);
            }
        }
        for (String str : tst.keysWithPrefix(prefixstr)) {
            System.out.println(str);
        }
    }

    public static String[] loadWords() {
        In in = new In("/Files/dictionary-algs4.txt");
        String[] words = in.readAllStrings();
        return words;
    }
}

