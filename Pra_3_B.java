import java.util.Scanner;

public class Pra_3_B {
    public static void main(String[] args)
    {
        int n,i=1;
        int x=0,y=1;  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value : ");
        n=sc.nextInt();
        System.out.print("Fibonacci Series : ");
        System.out.print(x+" "+y+" ");
        while(i<=n-2)
        {
            int z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
            i++;
            
        }

    }
    
}
