import java.io.*;
class Pra_15
{
 public static void main(String args[]) throws IOException
 { 
	int ch,ctr=1; 
	String fname; 
	DataInputStream in=new DataInputStream(System.in); 
	System.out.print("Enter a file name?"); 
	fname=in.readLine(); 
 	FileInputStream f=new FileInputStream(fname);
 	System.out.print(ctr+" "); 
	while((ch=f.read())!=-1)
	 { 
		System.out.print((char)ch);
 		if(ch=='\n') 
		{ 
			ctr++; 
			System.out.print(ctr+" "); 
		}	
	 } 	
} 
}