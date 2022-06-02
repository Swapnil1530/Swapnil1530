import java.util.*;

class Pra_14
{  
   public static void main(String args[])
	{  
     
		ArrayList<String> alist=new ArrayList<String>();

	 	alist.add("Steve");
	
        alist.add("Tim");
	  
      alist.add("Lucy");
	 
       alist.add("Pat");
		alist.add("Angela");
 
	        alist.add("Tom");

		System.out.println(alist);
               

 alist.add("Hiral");

                System.out.println(alist);
               
 alist.add(0, "SPCE");
                
System.out.println(alist);
               

 int numberofitems = alist.size();

                System.out.println("Size="+numberofitems);
               

 alist.remove("Hiral");
                
System.out.println(alist);


                numberofitems = alist.size();

		System.out.println("Size="+numberofitems);


		alist.remove(numberofitems-1);

		System.out.println(alist);

		
if(alist.contains("Steve"))

			System.out.println("Present");

		else

			System.out.println("Absent");


		String str= alist.get(2);

		System.out.println("String="+str);

}

}
