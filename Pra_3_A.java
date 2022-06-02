import java.util.Scanner;

public class Pra_3_A {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value: ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            { 
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            System.out.print("* ");
            System.out.println();
            
        }

        for (int i=n-1;i>=1;i--)
        {
            for (int j=n-i;j>=1;j--)
            { 
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            System.out.print("* ");
            System.out.println();
            
        }
        
    }
    
}
