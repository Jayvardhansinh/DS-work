import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[2][2];
        int y[][] = new int[2][2];
        System.out.println("Enter frist matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                y[i][j] = sc.nextInt();
            }
        }

        int z[][] = new int[2][2];
        System.out.println("Sum of matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
}