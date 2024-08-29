import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0; i<x.length; i++){
            x[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched:-");
        int key = sc.nextInt();
        int left = 0, right = n-1;
        int middle = 0;
        while(left < right){
            middle = ((left + right)/2);

            if(x[middle] == key){
                System.out.println("Element found at middle");
                return;
            }

            else if(key < x[middle]){
                right = middle-1;
            }

            else{
                left = middle+1;
            }
        }
        System.out.println("Element not found");
    }
}