class Human
{
    private int age;
    private String name;
    public Human() //default cons
    {
        age = 12;
        name = "Karan";

    }
    public Human(int a, String n) //parameterized const
    {
        age =a;
        name =n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public void setName(String n)
    {
        name = n;
    }
}

class Mobile
{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand+" : " +price+" : "+name+" : ");
    }
    public static void show1(Mobile obj)  //In this we have 2 solutions 1)either we can decalre static keyword for the instance varible
                                //2) We can pass the class obj (Object Reference)in static method and then we can the use instacne variable by just calling with it's obj (obj.branc,obj.price) and on...
    {
        System.out.println(obj.brand+" : " +obj.price+" : "+name+" : ");
    }
    static{
        name ="Karan";
        System.out.println("this is static block");
    }
    public Mobile()
    {
        brand ="";
        price =1092;
        System.out.println("this is constructor");



    }


}
public class practice {
    public static void main(String[] args) throws ClassNotFoundException {
//        Student s1 = new Student();
//        s1.rollno= 1;
//        s1.name= "Navin";
//        s1.marks=30;
//        Student s2 = new Student();
//        s2.rollno= 1;
//        s2.name= "Karan";
//        s2.marks=30;
//        Student s3 = new Student();
//        s3.rollno= 1;
//        s3.name= "Aditya";
//        s3.marks=30;
//        //System.out.println();
//        Student stud[]= new Student[3];
//        stud[0] =s1;
//        stud[1]=s2;
//        stud[2]=s3;
//
//        for(int i=0; i<stud.length; i++)
//        {
//            System.out.print(stud[i].name+" "+stud[i].rollno);
//            System.out.println("");
//        }
//        Mobile obj1 = new Mobile();
//        Mobile obj2 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 1500;
//        Mobile.name="NothingPhone";
        Class.forName("Mobile");

//
//        Mobile obj2 = new Mobile();
//        obj2.brand = "Apple";
//        obj2.price = 1500;
//        obj2.name = "SmartPhone";
//        obj2.show();
//        obj1.show();
//        Mobile.show1(obj1);
        Human obj = new Human();
        //obj.setName("Karan");
        //obj.setAge(20);
        System.out.println(obj.getAge()+" : "+obj.getName());







    }
}
