import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter Your Roll No. : ");
        // int rol = input.nextInt();
        // System.out.println("Your Roll No. is : "+ rol);
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter Temp. in Celcius : ");
        // float cel = input.nextFloat();
        // float f = (cel * 9/5) + 32;
        // System.out.println("Temperature " + cel + "in f is : " + f);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        input.close();
        int data = num;
        int r = 0;
        int sum = 0;
        while (num != 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        if (data == sum) {
            System.out.println(data + " is a palindrome number.");
        } else {
            System.out.println(data + " is not a palindrome number.");
        }
    }
}
