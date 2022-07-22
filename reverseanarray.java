import java.util.Scanner;

public class reverseanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int temp = 0;
        int n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int o = 0; o < n / 2; o++) {
            temp = arr[o];
            arr[o] = arr[n - 1 - o];
            arr[n - 1 - o] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

    }
}
