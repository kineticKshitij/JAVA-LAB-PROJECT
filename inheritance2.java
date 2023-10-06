//to demonstrate method overreiding and inheritance.
class Shape{
    public void area(){
   float  a=9;
   System.out.println("Radius="+a);   
    }
}
class Circle extends Shape{
    public void area(int a){
        
        System.out.println(3.14*a*a);
    }}
    class Rectangle extends Shape{
        public void area(int a,int b){
        System.out.println(a*b);}
    }

    public class Main{
        public static void main(String[] args)
        {
           Shape a=new Shape();
           a.area();
           Circle d= new Circle();
           d.area(5);
           Rectangle c=new Rectangle();
           c.area(5,7);
        }
    }