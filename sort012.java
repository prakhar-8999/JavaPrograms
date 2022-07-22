import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter then length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Your Sorted array");
        int x = 0;
        int y = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
                x++;
            }
        }
        for (int i = n - 1; i > -1; i--) {
            if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[y];
                arr[y] = temp;
                y--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
