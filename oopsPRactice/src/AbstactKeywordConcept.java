abstract class Car{
    abstract void drive();

    public void playMusic()
    {
        System.out.println("Playing music");
    }
}
abstract class BMW extends Car{
    public void drive()
    {
        System.out.println("Driving");
    }
}
class UpdatedBmw extends BMW
{
    public void stop()
    {
        System.out.println("Stop the car");
    }
}
public class AbstactKeywordConcept {
    Car obj = new UpdatedBmw();




}
