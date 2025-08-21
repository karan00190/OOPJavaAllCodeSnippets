public class Car extends InheritanceVehicle{
    private int numberOfDoors; //This is the add on attributes that has been added
    private String fuelType;

    public Car(String brand, int year,double price,int numberOfDoors, String fuelType)
    {
        super(brand, year, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;

    }
    @Override
    public void start()
    {
        System.out.println("Car engine is starting...");

    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of doors:"+numberOfDoors);
        System.out.println("Fuel type: "+fuelType);
        
    }
    public void openTrunk()
    {
        System.out.println("Trunk is opened");
    }
}
