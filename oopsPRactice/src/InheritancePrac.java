class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;

    }
}
class advCal extends Calc
{
    public int multi(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}
public class InheritancePrac {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4,5);
        int r2 = obj.add(7,3);
        System.out.println(r1+r2);

    }
}
