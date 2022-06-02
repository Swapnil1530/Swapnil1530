class Pra_17 extends Exception

{

private int detail;
Pra_17(int a)

{

detail = a;

}

public String toString()

{
return "ERROR: Negative value in X coordinate";

}

}
class demo

{

static void getMessage(int a) throws Pra_17

{

System.out.println("Called getMessage("+ a + ")");

if(a < 0)

throw new Pra_17(a);

System.out.println("Normal exit");

}

public static void main(String args[])

{

try

{

getMessage(1);

getMessage(-20);

}

catch (Pra_17 e)

{

System.out.println("Caught " + e);

}

}
}