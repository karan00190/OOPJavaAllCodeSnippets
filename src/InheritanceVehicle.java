public class InheritanceVehicle {
    protected String brand;
    protected int year;
    protected double price;

    public InheritanceVehicle(String brand,int year,double price)
    {
        this.brand = brand;
        this.year = year;
        this.price = price;

    }
    public void start()
    {
        System.out.println("Vehicle is starting..");
    }
    public void displayInfo()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+ year);
        System.out.println("Price: $"+price);
    }

}

