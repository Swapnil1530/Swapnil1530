
            import java.util.Scanner;

            class Pra_1
            {
                public static void main(String[]args)
                {
                   
                   int a,b,c,d;
                    char ch;
                    Scanner sc=new Scanner(System.in);
                    do{
                        System.out.print("Enter First Nomber: ");
                        a=sc.nextInt();
            
                        System.out.print("Enter Second nomber: ");
                        b=sc.nextInt();
            
                        System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
                        System.out.print("Enter Choice: ");
                        c=sc.nextInt();
            
                        switch(c)
                        {
                            case 1:d=a+b;
                                   System.out.println("Answer= "+d);
                                   break;
            
                            case 2:d=a-b;
                                   System.out.println("Answer= "+d);
                                   break;
            
                            case 3:d=a*b;
                                   System.out.println("Answer= "+d);
                                   break;
            
                            case 4: d=a/b;
                                   System.out.println("Answer "+d);
                                   break;
            
                            case 5:System.exit(0);
                                   break;
            
                            default: System.out.println("Invalid Choice");
            
                        }
                        System.out.println("Do You Want to Continue (Y/N)");
                        ch=sc.next().charAt(0);
                    }while(ch=='Y'||ch=='y');
                }
            }
            
         