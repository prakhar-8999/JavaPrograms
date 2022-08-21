import java.util.Scanner;

public class cyclicrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for (int q = 0; q < 8; q++) {
            arr[q] = sc.nextInt();
        }
        sc.close();
        int j = 8 - 1 - 1;
        for (int i = 8 - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for (int n = 0; n < 8; n++) {
            System.out.print(arr[n]);
        }
    }
}