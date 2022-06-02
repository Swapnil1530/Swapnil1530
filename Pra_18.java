
    class oddNumber implements Runnable
{
    public void run()
    {
      for(int i=1;i<=20;i++)
      {
        if(i%2 == 1)
        {
        System.out.println("odd Thread " + i);
        }
      }
    }
 }

 class evenNumber implements Runnable
 {
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
          if(i%2 == 0)
          {
          System.out.println("Even Thread " + i);
          }
        }
    }
 }

     public class Pra_18 {

        public static void main(String[] args) {
             oddNumber r1=new oddNumber();
             Thread t1=new Thread(r1);
             evenNumber r2=new evenNumber();
             Thread t2=new Thread(r2);
             t1.start();
             t2.start();
        }

    }