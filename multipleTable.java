
import java.util.Scanner;

public class multipleTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number whose multiple table you want   ");
        int n= sc.nextInt();
        int count = 0;
        for(int i=n;i<=n*10;i=i+n) {
            
            count++;

            System.out.println( n + " x "+count+ " = "+i);
        }

    }
    
}
