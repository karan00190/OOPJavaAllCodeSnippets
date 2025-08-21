public class Motorcycle extends InheritanceVehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, double price, boolean hasSidecar)
    {
        super(brand, year, price);
        this.hasSidecar = hasSidecar;
        
    }
    @Override
    public void start()
    {
        System.out.println("Motorcycle is starting");
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Has sidecar: "+hasSidecar);
    }
    public void wheelie()
    {
        System.out.println("Performing wheelie!");
    }

}
