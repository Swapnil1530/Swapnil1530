class Circle
{
    protected double radius;
    Circle(double a)
    {
        radius = a;
    }
    double area(){
        return Math.PI * radius*radius;
    }
}
class Cylinder extends Circle
{
  
    protected double height;
    Cylinder(double a,double b)
    { 
        super(a);
        height = b;
    }
    double Volume()
    { 
        return Math.PI*radius*radius * height;
    }
    double area()
    { 
        return 2*Math.PI*radius*height;
    }
    double Surface()
    { 
        return 2*Math.PI*radius*(radius + height);
    }
}
 class Pra_11
 {
   public static void main(String[] args) {
       Circle C= new Circle(4);
       System.out.println("Area of a Circle : "+C.area());
       Cylinder Cy= new Cylinder(3,2);
       System.out.println("Area of Cylinder :"+Cy.area());
       System.out.println("Surface of a Cylinder :"+Cy.Surface());
       System.out.println("Volume of a Cylinder :"+Cy.Volume());
   }
 }