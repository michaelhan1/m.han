/**
 * This program uses a for loop to name 5 films and asks the user to say how much each has taken so far
 * at the box office. It then lists which film made the most money and prints all the films.
 * 
 * Michael Han
 * 
 */
import java.util.Scanner;
public class films
{
    public static void main (String[] param)
    {
        String[] title = getnames();
        int[] gross = askuser(title);
        getHighGross(title, gross);
        getTotalSum(gross);
        PrintAll(title, gross);
    }
    public static String[] getnames()
    //creates an array method
    {
        final String title[] = new String[5];
        //creates an array called "title", and stores 5 variables in the array
        title[0] = "Despicable Me 3";//name 1
        title[1] = "Wonder Woman";//name 2
        title[2] = "It";//name 3
        title[3] = "Cars 3";//name 4
        title[4] = "Hidden Figures";//name 5
        return title;//returns the array
    }
    public static int[] askuser(String[] title)
    {
        int[] gross = new int[5];
        //creates an array called gross, to store the money madeby the films
        Scanner scanner = new Scanner(System.in);
        //creates scanner variable
        for(int i = 0; i < gross.length; i++)
        //loops through the films and asks user to input how much the film made
        {
            System.out.println("How much did " + title[i] + " make in millions of dollars? ");
            gross[i] = Integer.parseInt(scanner.nextLine());//takes user input
        }
        return gross;//returns the array
    }
    public static void getHighGross(String[] title, int[] gross )
    {
        String highestGrossing = "";
        int max = 0;
        for(int i = 0; i < gross.length; i++)
        //loops through film titles and looks to see if user input is greater than 0
        //if it is, it becomes the max. the next user input will then be checked to see
        //if it is greater than the current max, if so, it will be replaced
        {
            if(gross[i] > max)
            {
                max = gross[i]; 
                highestGrossing = title[i];
            }
        }
        System.out.println("Highest grossing film is currently " + highestGrossing);
        //prints highest film
    } //END getHighGross
    public static void getTotalSum(int[] gross)
    {
        int sum = 0;
        for (int i = 0; i < gross.length; i++)
        //runs through the array and gets the total of all films
        {
            sum+=gross[i];
        }
        System.out.println("Together these 5 films made $" + sum + " million");
    }//END getTotalSum
    public static void PrintAll (String title[], int gross[])
    {
        for(int i = 0; i < title.length; i++)
        //loops through films titles and prints the name and how much each film made
        {
            System.out.println(title[i] + ", $ " + gross[i] + " million");
        }
    }
}
