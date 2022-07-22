import java.util.Scanner;

public class negetiveoneside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int o = 0; o < n; o++) {
            arr[o] = sc.nextInt();
        }
        sc.close();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= -1) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
