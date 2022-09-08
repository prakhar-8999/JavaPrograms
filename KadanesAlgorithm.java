import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int o = 0; o < n; o++) {
            arr[o] = in.nextInt();
        }
        in.close();
        int maxsum = arr[0];
        int cursum = 0;
        for (int i = 0; i < n; i++) {
            cursum += arr[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.println(maxsum);

    }
}