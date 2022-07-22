import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial range : ");
        int irange = input.nextInt();
        System.out.print("Enter final range : ");
        int frange = input.nextInt();
        int temp = 0;
        int count = 0;
        int r = 0;
        input.close();
        int sum = 0;
        for (int i = irange; i < frange; i++) {
            System.out.println(i);
            temp = i;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            System.out.println(count);
            while (i != 0) {
                r = i % 10;
                sum = sum + (int) (Math.pow(r, count));
                i = i / 10;
            }
            count = 0;
        }
    }
}