
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int gcd = 0 ;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0  && b%i==0)
            gcd=i;
        }
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);


    }
    
}
