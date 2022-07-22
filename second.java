import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int pro = 0;
        int maxpro = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                for (int k = j + 1; k < a; k++) {
                    pro = arr[i] * arr[j] * arr[k];
                    if (pro > maxpro) {
                        maxpro = pro;
                    }
                }
            }
        }

        System.out.println(maxpro);

    }
}
