public class Introduction {
    private String brand;
    private String model;
    private int year;
    private double price;

    //Constructor
    public Introduction(String brand ,String model, int year,double price)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;

    }
    //non paremeterized constructor (default constructor)
    public Introduction()
    {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;

    }
    public void startEngine()
    {
        System.out.println("Engine started!");
    }
    public void displayInfo()
    {
        System.out.println(year + " "+ brand + " "+ model +"- $"+ price);
    }

    public String getBrand()
    {
        return brand;

    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getYear()
    {
        return year;

    }
    public void setYear(int year)
    {
        if(year > 1885)
        {
            this.year = year;
        }
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        if(price >=0)
        {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Introduction car1 = new Introduction("Toyota","Camry",2023,25500.0);
        Introduction car2 = new Introduction();
        car1.startEngine();
        car2.displayInfo();

        car2.setBrand("Honda");
        car2.setModel("Civic");
        car2.setYear(2);
        car2.setPrice(2100000);

        car2.displayInfo();
        //Encapsulation is bundling of data and methods within a class and restricting direct access to internal components
        //Key concepts : Data hiding -> using private access modifiers
        //               Controlled access : Using getter and setter methods
                        //Validation -> Adding checks in setter methods




    }

}
