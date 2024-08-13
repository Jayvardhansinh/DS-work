import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter a number:");
        int y = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=y; i++){
            ans = ans*x;
        }
        System.out.println(ans);
    }
}