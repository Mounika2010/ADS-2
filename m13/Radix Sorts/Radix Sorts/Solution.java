import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Driver function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[n];
        Quick3way quick3waysort = new Quick3way();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLine();
        }
        quick3waysort.sort(arr);
        String str = "[";
        int i;
        for (i = 0; i < n - 1; i++) {
            str = str + arr[i] + ", ";
        }
        str = str + arr[i] + "]";
        System.out.println(str);

    }
}

