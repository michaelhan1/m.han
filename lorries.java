
/**
 * This program will count the number of lorries on a country road.
 *
 * Michael Han
 * 
 */
import java.util.Scanner;
public class lorries
{
    public static void main (String[] param)
    {
       String vehicle = "";
       final String END = "CLOSE";
       double lorry = 0.0; //states lorry count equal to 0, can start counting from there
       double othervehicles = 0.0; //states other count equal to 0, can start counting from there
       while (!vehicle.equals("CLOSE"))//If CLOSE is typed it will end the program
       {
            vehicle = ans("Which kind of vehicle passed?");
            if(vehicle.equals("lorry"))
            {
                lorry = lorry + 1;//everytime a lorry is seen, the total lorries seen increases by 1
                othervehicles = othervehicles + 1;//everytime another vehicle is seen increases by 1
            }
            else if(vehicle.equals("car") | vehicle.equals("van"))
            {
                othervehicles = othervehicles + 1;//everytime another vehicle is seen increases by 1
            }
       } 
       results (lorry, othervehicles);
    }
    public static void results(double lorry, double othervehicles)
    {
        double percentage;//
        percentage = (lorry / othervehicles) * 100;//works out the percentage of the number of lorries seen
        System.out.println("You saw " + lorry + " lorries. Lorries were " + percentage + "% of all vehicles seen"); 
    }
    public static String ans (String message)
    {
        String ans;//declares the type of variable
        Scanner scanner = new Scanner(System.in);//asks for input
        System.out.println("Which kind of vehicle passed?");
        ans = scanner.nextLine();//record input
        return ans;
    }
}
