import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0; i<x.length;i++){
            System.out.println("Insert Element");
            x[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:-");
        int key = sc.nextInt();
        for(int i=0; i<x.length;i++){
            if(key == x[i]){
                System.out.println("Element found at index " + i);
                return;
            }
        }
    }
}