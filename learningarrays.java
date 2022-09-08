import java.util.Scanner;

public class learningarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int o = 0; o < n; o++) {
            arr[o] = in.nextInt();
        }
        in.close();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                System.out.println(1);
            }
            for (int j = i; j < n; j++) {
                sum += arr[j];
            }
            if (sum == 0) {
                break;
                // System.out.println(1);
            }
            sum = 0;
        }
        System.out.println(sum);
    }
}