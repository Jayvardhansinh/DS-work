import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int count = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if (count <= 2) {
            System.out.println("entered number is prime: ");
        } else {
            System.out.println("entered number is not prime: ");
        }
    }
}