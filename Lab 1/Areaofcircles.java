import java.util.Scanner;
public class Areaofcircles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val of r:");
        int r = sc.nextInt();
        double a = r*r*Math.PI;
        System.out.println(a);
    }
}