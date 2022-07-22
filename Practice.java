import java.util.Scanner;
import java.lang.String;

public class Practice {
    // public static void printname(String name){
    // System.out.println(name);

    // }

    // public static int stttrr(String line){
    // for (int i = s ; i<line.length() ; i++){
    // if (line.charAt(s) == line.charAt(i)){
    // count++;
    // }
    // else{
    // str = str + line.charAt(s) + Integer.toString(count);
    // s = i
    // break;
    // }
    // }
    // }
    public static int add(int a, int sum) {
        while (a > 0) {
            int i = a % 10;
            sum = sum + i;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int sum = 0;
        int odd = add(a, sum);
        while (odd >= 10) {
            sum = 0;
            odd = add(odd, sum);
        }
        System.out.println(odd);

        // int arr[] = new int[a];
        // int i = a/2;
        // int j = -i;

        // if (a%2 == 0){
        // for(int o = 0; o<a;o++){
        // if (j == 0){
        // j++;
        // arr[o] = j;
        // }
        // else{
        // arr[o] = j;
        // }
        // j++;

        // }
        // }
        // else{
        // for(int o = 0;o<a;o++){
        // arr[o] = j;
        // j++;
        // }
        // }

        // for (int p = 0;p<a;p++){
        // System.out.print(arr[p]);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the initial range : ");
        // int a = sc.nextInt();
        // int co = 0;
        // ;
        // System.out.print("Enter the final range : ");
        // int b = sc.nextInt();
        // for(int i = a;i < b;i++){
        // int v = 0;
        // if (i%10 == 0){
        // continue;
        // }
        // int temp = i;
        // int num = i;
        // while(temp>0){
        // int n = temp%10;
        // co++;
        // temp = temp/10;
        // }
        // int arr[] = new int[co];
        // while(num>0){
        // int n = temp%10;
        // arr[v] = n;
        // temp = temp/10;
        // v = v + 1;
        // }

        // for(int o = 0;o<co;o++){
        // if(i%arr[o] != 0){
        // break;
        // }
        // else{
        // System.out.println(i);
        // }
        // }
        // }

        // int count = 0;
        // int arr[] = new int[a];
        // int ar[] = new int[a];
        // System.out.println("Enter the elements off array : ");
        // for(int i = 0;i < a;i++){
        // arr[i] = sc.nextInt();
        // }

        // for(int i = 0;i < a;i++){
        // for(int j = 0;j < a;j++){
        // if (i == j){
        // continue;
        // }
        // if (arr[i] == arr[j]){
        // count++;
        // }
        // }
        // if (count == 0){
        // System.out.println(arr[i]);
        // }
        // }

        // System.out.println("Enter string to reverse:");

        // Scanner read = new Scanner(System.in);
        // String str = read.nextLine();
        // String reverse = "";

        // for(int i = str.length() - 1; i >= 0; i--)
        // {
        // reverse = reverse + str.charAt(i);
        // }

        // System.out.println("Reversed string is:");
        // System.out.println(reverse);

        // System.out.println(mynumber);
        // do {
        // System.out.print("Guess my number : ");
        // num = sc.nextInt();
        // if (num == mynumber){
        // System.out.println("You Won !!!!!");
        // break;
        // }

        // else{
        // System.out.println("Sorry You Lose !!!!!");
        // System.out.println();
        // System.out.println(" NO WORRIES TRY AGAIN ....");
        // System.out.println();
        // System.out.println("If you want to Quit ----- Enter -1 ");
        // System.out.println();
        // }
        // }while(num >= 0);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First Number : ");
        // int c = sc.nextInt();
        // System.out.print("Enter Second Number : ");
        // int d = sc.nextInt();
        // int e = add(c,d);
        // System.out.println(e);

        // String name = sc.nextLine();
        // for(int i = 0 ; i < 5 ; i++){
        // printname(name);
        // }

        // for(int i = 100; i >= 0; i--) {
        // System.out.println(i);
        // }
        // int i = 1;
        // while (i <= 100){
        // System.out.println(i);
        // i++;
        // }
        //
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a Number : ");
        // int a = sc.nextInt();
        // if (a%2 == 0 || a%3 == 0 || a%5 == 0){
        // for(int i = 7 ; i < a ; i++){
        // if (a%i == 0){
        // for(int b = 1 ; b < i+1 ; b++){
        // if (i%b == 0){
        // c++;
        // }
        // System.out.println("false");
        // }
        // else{
        // System.out.println("true");
        // }
        // }

        // }
        // int c = 0;
        // int count = 0;
        // for(int i = 2 ; i < a ; i++){
        // if (a%i==0){
        // for(int b = 1 ; b < i+1 ; b++){
        // if (i%b == 0){
        // c++;
        // }
        // }

        // if (c == 2 && i != 7)
        // count = count + i;
        // c = 0;
        // }
        // }
        // System.out.println(count);
        // if (){
        // System.out.println("True");
        // }
        // else{
        // System.out.println("False");
        // }

    }
}