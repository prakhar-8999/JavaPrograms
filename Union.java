import java.util.*;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array : ");
        int b = sc.nextInt();
        int arr1[] = new int[b];
        System.out.println("Enter elements of firt array : ");
        for (int i = 0; i < b; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array : ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter elements of second array : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < b; i++) {
            map.put(arr1[i], arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            map.put(arr2[i], arr2[i]);
        }
        System.out.println(map.size());
    }
}
