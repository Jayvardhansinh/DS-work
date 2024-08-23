import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int x = sc.nextInt();
        System.out.println("Enter second num:");
        int y = sc.nextInt();
        Swap(x,y);
    }

    public static void Swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x+" "+y);
    }
}
