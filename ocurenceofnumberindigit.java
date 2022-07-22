import java.util.Scanner;

public class ocurenceofnumberindigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long digit = input.nextLong();
        int num = input.nextInt();
        input.close();
        int count = 0;
        int a = 0;
        while (digit != 0) {
            a = (int) digit % 10;
            if (a == num) {
                count++;
            }
            digit = digit / 10;
        }
        System.out.println(count);
    }
}
