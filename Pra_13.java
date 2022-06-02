interface A
{
     int A=1;
    void method_A();
}
interface A1 extends A
{
     int A1=2;
    void method_A1();
}
interface A2 extends A
{
    int A2=3;
    void method_A2();
}
interface A12 extends A1,A2
{
    int A12=4;
    void method_A12();
}
class B implements A12
{
    
    public void method_A1() {
        System.out.println("A1 Class Method Constant : "+A1);
        
    }
    
    public void method_A() {
        System.out.println("A Class Method Constant : "+A);
        
    }
  
    public void method_A2() {
        System.out.println("A2 Class Method Constant : "+A2);
        
    }

    public void method_A12() {
        System.out.println("A12 Class Method Constant : "+A12);
        
    }
}
class Pra_13
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.method_A12();
        obj.method_A1();
        obj.method_A2();
        obj.method_A();
    }
}
