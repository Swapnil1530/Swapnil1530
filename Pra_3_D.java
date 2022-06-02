import java.util.Scanner;

public class Pra_3_D {
    public static void main(String[] args) {
        int n,rem,reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("Reverse Number: "+reverse);
    }
    
}
