import java.util.Scanner;

public class Pra_3_C {
    public static void main(String[] args)
    {
        int n,sum = 0,digit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nomber: ");      
        n=sc.nextInt();
        while(n>0)
        {
           digit=n%10;
           sum=sum+digit;
           n=n/10;
        }  
        System.out.println("Sum = "+sum);
    }
    
}
