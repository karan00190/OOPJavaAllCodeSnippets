class X
{
    public void show()
    {
        System.out.println("In A show");
    }
    public void config()
    {
        System.out.println("in A Config");
    }

}
class Y extends X
{
    public void show()
    {
        System.out.println("in B show");
    }



}
public class MethodOverriding {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
    }


}
