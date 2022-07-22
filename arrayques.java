import java.util.Scanner;
import java.lang.String;

public class arrayques {

    static void rearrange(int arr[]) {
        int j = -1, temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        rearrange(arr);

        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}