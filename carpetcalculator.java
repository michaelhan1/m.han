
/**
 * This is a program that will work out the area of carpet needed with wastage
 *
 *
 * Michael Han
 */
import java.util.Scanner;
public class carpetcalculator
{ public static void main(String[] args)
    
    {   
        double length = lengthofroom();
        double width = widthofroom(); 
        overall(length, width);
        
        
    }
public static double lengthofroom() 
    {
    double length;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the floor:");
    //This will ask the user to input the value of the length
    length = Double.parseDouble(scanner.nextLine());
    return length; 
} //END the length
public static double widthofroom()
{
    double width;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the width of the floor:");
    //This will ask the user to input the value of the width
    width = Double.parseDouble(scanner.nextLine());
    //calculate the area of carpet needed\\
    return width;
} //END the width
public static void overall(double length, double width)
{
    double area; double waste; double total;
    area = Math.round((length * width)*10.0)/10.0;
    total = area;
    System.out.println("The area of carpet needed is " + total);
    //Once the area is calculated we now need to work out the amount of waste
    waste = area * 5/100;
    //to work out waste we multiply by 5 and then divide by 100
    System.out.println("The extra you need for waste: " + waste);
    //This will print out the amount of wates needed for the carpet
    System.out.println("The total area needed is: " + Math.round((waste + total)*10.0)/10.0);
    //This will print out the total area needed, meaning that the waste and the total area will be added together. 
    
    
    
    return;
    } //END overall

   
}
