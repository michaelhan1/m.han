
/**
 * This program will print out the lyrics of the song green bottles or a number that is types between 1-10
 *
 * Michael
 * 
 */
import java.util.Scanner;

public class greenbottles
{
    public static void main(String[] param)
    {
        int n = bottles();//returns the variable int n to the main method
        lyrics(n);//second method uses returned value
        System.exit(0);
    }
    
    public static int bottles()
    {
        int n;//variable n is declared as an integer
        Scanner scanner = new Scanner(System.in);//creatse scanner variable
        System.out.println("How many green bottles are on the wall?");
        //This will ask the user to type in however many bottles between 1-10 they would like to start with
        n = Integer.parseInt(scanner.nextLine());//takes user input
        return n;//returns value
    }
    public static void lyrics(int n)
    {
        for (int i = n; i >=1; i--)
        //The for loop for this is n is declared by the user, and it will run up until i>0,
        //and it will decrement by 1 each time it goes round the loop
        {
            System.out.println(i + " green bottles, standing on a wall, ");
            System.out.println(i + " green bottles, standing on a wall, ");
            System.out.println("but if one green bottle were to accidently fall, there will be...");
            if (n == 1)//Once it equates to 1, the lyrics change so that there is 1 singular bottle
            {
                System.out.println("1 green bottle, standing on the wall, ");
                System.out.println("1 green bottle, standing on the wall, ");
                System.out.println("but if one green bottle were to accidently fall, there will be...");
            }
        }
        System.out.println(" no green bottles standing on the wall");
        //This is the final line
}
}
