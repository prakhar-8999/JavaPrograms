import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int num = in.nextInt();
        in.close();
        int c = 0;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
