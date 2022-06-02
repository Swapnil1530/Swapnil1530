import java.io.File; 
class Pra_16
{ 
public static void main(String args[]) 
{ 
File f1 = new File("file.txt"); 
System.out.println("File Name: " + f1.getName()); 

System.out.println(f1.exists() ? "exists" : "does not exist"); 
System.out.println(f1.canWrite() ? "is writeable" : "is not writeable"); 
System.out.println(f1.canRead() ? "is readable" : "is not readable"); 

System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe"); 

System.out.println("File size: " + f1.length() + " Bytes"); 
} 
} 