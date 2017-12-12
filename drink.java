
/**
 * This will ask the user what drink they would like and then tell them the price
 *
 * Michael Han
 * 
 */
import java.util.Scanner;

public class drink
{
    public static void main(String[] param)
    {
        int n = whichdrink(); //This will be the method that asks what drink they want
        result(n);
        
    } //END main

    public static int whichdrink()
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What drink would you like? 1.Coffee 2.Tea 3.Chocolate");
        //This asks the user what drink they would like
        n = Integer.parseInt(scanner.nextLine());
        //answer is stored in n
        return n;
    }
    public static void result(int n)
    {
        if (n == 1)//if the user ask for 1
        {
            System.out.println("Coffee costs 3.50");
        }
        else if (n == 2)//if the user asks for 2
        {
            System.out.println("Tea costs 2.50");
        }
        else if (n == 3)//if the user ask for 3
        {
            System.out.println("Chocolate costs 3.00");
        }
        else if (n == 4)//if the user asks for 4
        {
            System.out.println("We do not have number 4, please pick another");
        }
        else//if the userasks for any other number 
        {
            System.out.println("We do not have that number, please pick another");
        }
        return;
    }

   
    }

