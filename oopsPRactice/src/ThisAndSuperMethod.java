class Base
{
    public Base()
    {
        super(); //This super represent the constructor of super class
        System.out.println("In A class");
    }
    public Base(int n)
    {
        super();
        System.out.println("In A class paremeterized");
    }

}
class B extends Base
{
    public B()
    {
        super();
        System.out.println("In B class");   
    }
    public B(int n )
    {
        this();  //will execute the constructor of same class
        System.out.println("in B parameterized ");
    }


}
public class ThisAndSuperMethod {
    public static void main(String[] args) {
        B obj = new B(5);

    }

}
