import java.util.Scanner;
import java.lang.String;
public class digitsum {
    public static int add(int n){
        if (n == 0){
            return 0;
        }
        else{
            if(n % 9 == 0){
                return 9;
            }
            else{
                return (n%9);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(add(n));
    }
}
