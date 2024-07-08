
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int num = sc.nextInt();
        int last=0;
        int rev=0;
       
        int n= num;

        while(n!=0)
        {
            last=n%10;
           rev = rev*10+last;
           n=n/10;
            
        }

        if(num==rev){
            System.out.println("palendrome");
        }
        else{
            System.out.println("not palendrome");
        }
        
        
       
        

       
       
    
    }
    
}
