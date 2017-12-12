
/**
 * This program helps a salesperson work out the price to charge customers
 *
 * Michael Han
 * 
 */
import java.util.Scanner;
public class CarSales
{
    public static void main( String[] param)
    {
        int baseprice = BasePrice();
        int model = Model();
        int roof = Roof();
        CarInfo c1 = info(model, baseprice, roof);
        UserInput(c1, model, roof, baseprice);
        
    }
    public static int BasePrice()
    {
        int baseprice;//declares the variable baseprice as an integer
        Scanner scanner = new Scanner(System.in);//
        System.out.println("Base Price?");//asks user for base price
        baseprice = Integer.parseInt(scanner.nextLine());//takes user input and saves it under baseprice
        return baseprice;
    }
    public static int Model()
    {
        String model1;
        int model = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hybrid or Electric?");
        model1 = scanner.nextLine();//takes user input
        if (model1.equalsIgnoreCase("Electric"))//if user types electric
        {
            model = -1000;//return value becomes -1000
        }
        else
        {
            model = 0;//return value becomes 0
        }
        return model;
    }
    public static int Roof()
    {
        String input;
        int roof = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sunroof?Yes/No");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("Yes"))//if user wants a sunroof
        {
            roof = 500;//return value becomes 500
        }
        else
        {
            roof = 0;//return value becomes 0
        }
        return roof;
    }
    public static CarInfo info(int model, int baseprice, int roof)//sets the record
    {
       CarInfo c1 = new CarInfo();
       //creates a new record to store the car details
       c1 = setModel(c1, model);//stores the model under setModel()
       c1 = setBaseprice(c1, baseprice);//stores baseprice under setBaseprice
       c1 = setRoof(c1, roof);//stores roof under setRoof
       
       return c1;
    }
    public static void UserInput(CarInfo c1, int model, int roof, int baseprice )
    {
        System.out.println("Base Price : " + getBaseprice(c1));
        //prints out what the user wanted by getting what was stored in the getter methods
        if (model == -1000)
        {
            System.out.println("Electric : " + getModel(c1));
            //prints out the what type of car the user wanted by gettermethods
        }
        System.out.println("Sun roof : " + getRoof(c1));
        //prints out additional sunroof cost using getter methods
        System.out.println("Total : " + ((baseprice + model) + roof));
        //to work out total all three variables are added togther.
    }
    
    public static int getModel (CarInfo c)
    {
     return c.model;
    }
   
    public static int getBaseprice (CarInfo c)
    {
     return c.baseprice;
    }

    public static int getRoof (CarInfo c)
    { 
     return c.roof;
    }
   
    public static CarInfo setModel (CarInfo c, int model)
    {
     c.model = model;
     return c;
    }
  
    public static CarInfo setRoof (CarInfo c, int roof)
    {
     c.roof = roof;
     return c;
    }

    public static CarInfo setBaseprice (CarInfo c, int baseprice)
    {
     c.baseprice = baseprice;
     return c;
    }
}
class CarInfo
//this is initialisng variables in a record
{
    int model;
    int baseprice;
    int roof;
}
