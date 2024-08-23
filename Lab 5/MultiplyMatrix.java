import java.util.Scanner;
public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[3][2];
        int y[][] = new int[2][3];
        System.out.print("Enter value of matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                x[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter value of matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                y[i][j] = sc.nextInt();
            }
        }
        int z[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<2; k++){
                    z[i][j] += x[i][k]*y[k][j];
                }
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
    }
}