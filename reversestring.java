import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String st = sc.next();
        sc.close();
        for (int i = st.length() - 1; i > -1; i--) {
            str = str + st.charAt(i);
        }
        System.out.print(str);
    }
}
