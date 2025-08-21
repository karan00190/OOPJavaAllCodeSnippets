public abstract class AbstractionExample {
    protected String color;

    public AbstractionExample(String color)
    {
        this.color = color;

    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayColor()
    {
        System.out.println("Color "+color);
    }

}
