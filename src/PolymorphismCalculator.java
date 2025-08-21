public class PolymorphismCalculator {
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
    public int add(int a, int b , int c)
    {
        return a+b+c;

    }
    public String add(String a, String b)
    {
        return a+b;
    }
    public class PolymorphismDemo{
        public static void main(String[] args) {

            InheritanceVehicle[] vehicles = {
                    new Car("Toyota",2023,25000,4,"Gasoline"),
                    new Motorcycle("Harley",2022,15000,false),
                    new Car("Tesla",2024,5000000,4,"Electric Car")
            };

            for(InheritanceVehicle vehicle : vehicles)
            {
                vehicle.start();
                vehicle.displayInfo();
                System.out.println("---");
            }
            PolymorphismCalculator calculator = new PolymorphismCalculator();
            System.out.println(calculator.add(5,3));
            System.out.println(calculator.add(5.5,6.6));
            System.out.println(calculator.add(1,2,3));
            System.out.println(calculator.add("hello","World"));
        }
    }
}

