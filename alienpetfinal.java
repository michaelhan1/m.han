
/**
 * This is a program that simulates alien pets that the player must look after
 *
 * Michael Han
 *
 */

import java.util.Scanner;
import java.util.Random;


public class alienpetfinal
{
    public static void main (String[] param)
    {
        HungerRecord[] hungerRec = createHungerArray();
        String name = nameyourpet();
        int hunger = feeding();
        int mood = mooding(hunger);
        PetInfo p1 = info(name, hunger, mood);
        int daycount = 0;
        hungerlevel(p1, hunger, mood, daycount, hungerRec);
        feeding();

    }// END
    public static String nameyourpet()
    {
        String name ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to name your pet?");
        name = scanner.nextLine();//ask for user input
        System.out.println("Welcome to your new home " + name);//takes user input and prints message
        System.out.println("Type 'hunger' to check on your pet");
        return name;
    }// END name your pet

    public static PetInfo info(String name, int hunger, int mood)//sets record for pet
    {
        PetInfo p1 = new PetInfo();
        p1 = setName(p1, name);//sets the name of the pet that is retrieved from method
        p1 = setHunger(p1, hunger);//sets the hunger of the pet that is retrieved from method
        p1 = setMood(p1, mood);//sets the mood of the pet that is retrieved from method
        return p1;
    }

    public static int feeding()//a random number is generated at the start for hunger
    {
        String health;
        Scanner scanner = new Scanner(System.in);
        health = scanner.nextLine();
        if (health.equalsIgnoreCase("hunger"));//if 'hunger' is typed then a random number is given
        {
            Random feed = new Random();
            int hunger = feed.nextInt(10) + 1;//this will give a random hunger value
            return hunger;
        }
    }

    public static int mooding(int hunger)//the mood level depends on the hunger level generated
    {
        int mood = 0;
        if (hunger >= 9 )//when hunger is 9+ mood value 1 is given
        {
            mood = 1;
        }
        else if(7 <= hunger & hunger <= 8 )//hunger is 7 or 8, mood 2 is given
        {
            mood = 2;
        }
        else if(4 <= hunger & hunger <= 6)//hunger is 4 to 6, mood 3 is given
        {
            mood = 3;
        }
        else if(hunger <= 3)//hunger is less than 3, mood 4 is given
        {
            mood = 4;
        }
        return mood;
    }

    public static void petDied(HungerRecord[] hr)
    {
        HungerRecord[] sorted = bubbleSort(hr);//sorts the parsed array hr
        printArray(sorted);//prints it
        System.exit(0);//exits program
    }

    public static void hungerlevel(PetInfo p1, int hunger, int mood, int daycount, HungerRecord[] hr)
    {
        saveDailyStatus(p1, hunger, mood, daycount, hr);//calls the method saveDailyStatus, contains arrays
        daycount++;
        if (daycount==200)//once daycount reaches 200 rounds, game ends, and petDied(hr) method is called
        {
            System.out.println("Game Over");
            petDied(hr);
        }
        Scanner scanner = new Scanner(System.in);
        String closing;
        closing = scanner.nextLine();

        if(closing.equalsIgnoreCase("Close"))//if close is typed, petDied(hr) method is called
        {
            petDied(hr);
        }

        if(hunger <= 0)//if hunger reaches 0
        {
            System.out.println("Your pet has died");
            System.out.println("Pick a day to return to: or type exit to quit and see your best day");
            PetInfo[] days = getDailyStatus(p1);//uses arrays to call back to a day
            int day = 0;
            for(PetInfo p : days)
            {
                if(day < daycount)
                {
                    System.out.println("Day " + day + " Hunger: " + getHunger(p));
                }
                day++;
            }
            System.out.println("Day: ");
            Scanner keyboard = new Scanner(System.in);
            String dayToReturn = keyboard.next();//saves the day user wants to return to
            if(dayToReturn.equalsIgnoreCase("exit"))//if exit is typed, petDied(hr) method is called
            {
                petDied(hr);
            }
            else//if aything other than exit is typed it will return to a specified day
            {
                int intReturn = Integer.parseInt(dayToReturn);
                p1 = p1.dailyStatus[intReturn];
                daycount = intReturn;
                hungerlevel(p1, getHunger(p1), getMood(p1), intReturn, hr);
            }
        }
        int i = hunger;
        if (i >= 9 )//if the hunger value is 9+
        {
            System.out.println(getName(p1) + " has a hunger level of " + i);
            System.out.println(getName(p1) + " is not hungry yet");
            System.out.println(getName(p1) + " has a mood level of " + getMood(p1));
            System.out.println(getName(p1) + " is happy");
            String ans;
            int feeding;
            System.out.println("Would you like to feed " + getName(p1) + "? Yes/No");//asks user to feed pet
            ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("Yes"))
            {
                System.out.println("Type in a number you want to feed your pet by?");
                feeding = Integer.parseInt(scanner.nextLine());//records how much the user feeds by
                int newhunger = feeding + i;//adds it to original hunegr value
                System.out.println(getName(p1) + " now has a hunger level of " + newhunger);
                setHunger(p1, newhunger);//newhunger value is set
                hungerlevel(p1, newhunger, mood, daycount, hr);
            }
            else if (ans.equalsIgnoreCase("No") | ans.equals(""))
            {
                hungerlevel(p1, hunger-1, mood, daycount, hr);
            }
        }
        else if(7 <= i & i <= 8 )
        {
            System.out.println(getName(p1) + " has a hunger level of " + i);
            System.out.println(getName(p1) + " is feeling a little peckish");
            System.out.println(getName(p1) + " has a mood level of 2");
            System.out.println(getName(p1) + " is calm");
            String ans;
            int feeding;
            System.out.println("Would you like to feed " + getName(p1) + "? Yes/No");
            ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("Yes"))
            {
                System.out.println("Type in a number you want to feed your pet by?");
                feeding = Integer.parseInt(scanner.nextLine());
                int newhunger = feeding + i;
                System.out.println(getName(p1) + " now has a hunger level of " + newhunger);
                setHunger(p1, newhunger);
                hungerlevel(p1, newhunger, mood, daycount, hr);
            }
            else if (ans.equalsIgnoreCase("No") | ans.equals(""))
            {
                hungerlevel(p1, hunger-1, mood, daycount, hr);
            }
        }
        else if(4 <= i & i <= 6)
        {
            System.out.println(getName(p1) + " has a hunger level of " + i);
            System.out.println(getName(p1) + " is now quite hungry");
            System.out.println(getName(p1) + " has a mood level of 3");
            System.out.println(getName(p1) + " is tetchy");
            String ans;
            int feeding;
            System.out.println("Would you like to feed " + getName(p1) + "? Yes/No");
            ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("Yes"))
            {
                System.out.println("Type in a number you want to feed your pet by?");
                feeding = Integer.parseInt(scanner.nextLine());
                int newhunger = feeding + i;
                System.out.println(getName(p1) + " now has a hunger level of " + newhunger);
                setHunger(p1, newhunger);
                hungerlevel(p1, newhunger, mood, daycount, hr);
            }
            else if (ans.equalsIgnoreCase("No") | ans.equals(""))
            {
                hungerlevel(p1, hunger-1, mood, daycount, hr);
            }
        }
        else if(i <= 3 & i > 0)
        {
            System.out.println(getName(p1) + " has a hunger level of " + i);
            System.out.println(getName(p1) + " is now very hungry");
            System.out.println(getName(p1) + " has a mood level of 4");
            System.out.println(getName(p1) + " is looking dangerous");
            System.out.println("GET OUT OF THERE NOW!!!!");
            String ans;
            int feeding;
            System.out.println("Would you like to feed " + getName(p1) + "? Yes/No");
            ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("Yes"))
            {
                System.out.println("Type in a number you want to feed your pet by?");
                feeding = Integer.parseInt(scanner.nextLine());
                int newhunger = feeding + i;
                System.out.println(getName(p1) + " now has a hunger level of " + newhunger);
                setHunger(p1, newhunger);
                hungerlevel(p1, newhunger, mood, daycount, hr);
            }
            else if (ans.equalsIgnoreCase("No") | ans.equals(""))
            {
                hungerlevel(p1, hunger-1, mood, daycount, hr);
            }
        }

    }

    public static void saveDailyStatus(PetInfo p, int hunger, int mood, int currentDay, HungerRecord[] hr)
    {
        PetInfo tempPet = new PetInfo();//creates new class (tempPet)
        setName(tempPet, getName(p));//getter and setter
        setMood(tempPet, mood);
        setHunger(tempPet, hunger);
        setDailyStatus(tempPet, getDailyStatus(p));
        p.dailyStatus[currentDay] = tempPet;
        
        setDay(hr[currentDay], currentDay);//stores hunger on its corresponding day
        setHungerness(hr[currentDay], hunger);
    }

    private static HungerRecord[] bubbleSort(HungerRecord[] inputArray) {
        HungerRecord[] array = inputArray; //create a new array
        int n = array.length;
        HungerRecord temp = null;
        for(int i=0; i < n; i++){//for 0 to array length (all days)
            for(int j=1; j < (n-i); j++){ //for 1 to array length - i. 

                if(getHungerness(array[j-1]) < getHungerness(array[j])){//if position before is smallerthan current, swap position
                    //swap the elements!
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;//return the new array, now sorted
    }
    
    public static void printArray(HungerRecord[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            if(getDay(array[i]) != -1)//if the day has been played
            {
                System.out.println("Day " + getDay(array[i]) + "  Hunger: " + getHungerness(array[i]));
            }
        }
    }

    public static HungerRecord[] createHungerArray()
    {
        final int arraySize = 200;//sets the array size to 200 rounds of the game
        HungerRecord[] hr = new HungerRecord[200];
        for(int i = 0; i < arraySize; i++)//goes through the array and and records each day's hunger level
        {
            hr[i] = blankHungerRecord();
        }
        return hr;
    }

    public static String getName(PetInfo p)
    {
        return p.name;
    }

    public static int getHunger(PetInfo p)
    {
        return p.hunger;
    }

    public static int getMood(PetInfo p)
    {
        return p.mood;
    }

    public static PetInfo setName(PetInfo p, String petname)
    {
        p.name = petname;
        return p;
    }

    public static PetInfo setMood(PetInfo p, int petmood)
    {
        p.mood = petmood;
        return p;
    }

    public static PetInfo setHunger (PetInfo p, int pethunger)
    {
        p.hunger = pethunger;
        return p;
    }

    public static PetInfo setDailyStatus(PetInfo p, PetInfo[] daily)
    {
        p.dailyStatus = daily;
        return p;
    }

    public static PetInfo[] getDailyStatus (PetInfo p)
    {
        return p.dailyStatus;
    }

    public static int getDay(HungerRecord hr)
    {
        return hr.day;
    }

    public static void setDay(HungerRecord hr, int day)
    {
        hr.day = day;
    }

    public static int getHungerness(HungerRecord hr)
    {
        return hr.hunger;
    }

    public static void setHungerness(HungerRecord hr, int hunger)
    {
        hr.hunger = hunger;
    }

    public static HungerRecord blankHungerRecord(){//default values
        HungerRecord h = new HungerRecord();
        setDay(h, -1);
        setHungerness(h, 0);
        return h;
    }
    
}
class PetInfo
{
    String name;
    int hunger;
    int mood;
    PetInfo[] dailyStatus = new PetInfo[200];
}
class HungerRecord
{
    int day;
    int hunger;
}