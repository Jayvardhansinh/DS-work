import java.util.Scanner;
public class BubbleSort{
    public static void main(String[] args){
        System.out.println("Enter the Size of an Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++){
            System.out.println("Enter Element = " + i);
            x[i] = sc.nextInt();
        }

        boolean isSwap = false;
        for (int i = 0; i < n - 1; i++){
            isSwap = false;
            for (int j = 0; j < n - 1 - i; j++){
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap){
                break;
            }
        }

        System.out.println("Completed");
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]);
            System.out.print(" ");
        }
    }
}