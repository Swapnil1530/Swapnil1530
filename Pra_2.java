import java.util.Scanner;
public class Pra_2 {
   public static void main(String args[]){
    
	
	double Root1 = 0, Root2 = 0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of a: ");
      double a = sc.nextDouble();

      System.out.print("Enter the value of b: ");
      double b = sc.nextDouble();

      System.out.print("Enter the value of c: ");
      double c = sc.nextDouble();

      double d = (b*b)-(4*a*c);
       

      if(d>0){
         Root1 = (-b +Math.sqrt(d))/(2*a);
         Root2 = (-b - Math.sqrt(d))/(2*a);
         System.out.print("Roots are: "+ Root1 +" and "+Root2);
      }else if(d == 0){
         System.out.print("Root is: "+(-b + Math.sqrt(d))/(2*a));
      }
	  else 
	  System.out.println("Root are imaginary");
   }
}