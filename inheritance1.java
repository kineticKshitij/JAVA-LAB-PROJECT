//to demonstrate method overreiding and inheritance.
class Animal{
    public void eat(){
   float  a=9; System.out.println(a);   
    }
}
class Dog extends Animal{
    public void eat(){
        super.eat();
        System.out.println(45);
    }
    
}
    public class Main{
        public static void main(String[] args)
        {
           Animal a=new Animal();
           a.eat();
           Dog d= new Dog();
           d.eat();
           Animal c=new Dog();
           c.eat();
        }
    }