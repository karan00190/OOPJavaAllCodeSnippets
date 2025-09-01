//interface inter
//{
//    int age=10;
//    String area="Mumbai";
//    void show();
//    void config();
//}
//interface xyz
//{
//    void run();
//}
//interface zyx extends xyz{
//
//}
//class classEx implements inter,xyz
//{
//    @Override
//    public void show() {
//        System.out.println("In show");
//    }
//
//    @Override
//    public void config() {
//        System.out.println("In config..");
//    }
//    public void run()
//    {
//        System.out.println("in run");
//    }
//}

class Laptop
{
    public void code()
    {
        System.out.println("code..compile ..run");
    }

}
class Developer
{
    public void devApp(Laptop lap)
    {
        lap.code();
    }
}
public class InterfaceExampleConcept {
    public static void main(String[] args) {
//        inter obj;
//        obj = new classEx();
//        obj.show();
//        obj.config();
        Laptop lap = new Laptop();
        Developer karan = new Developer();
        karan.devApp(lap);
    }
}
