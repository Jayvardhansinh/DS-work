import java.util.Scanner;
public class Factorial_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
    public static int fact(int a) {
        if (a == 1 || a == 0) {
            return 1;
        }
        return a * fact(a - 1);
    }
}