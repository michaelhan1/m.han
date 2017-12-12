
//Michael Han
//This program will give you information about different tube stations
import java.util.Scanner;
public class Stations
{ 
   public static void main(String []p)
   {
       String input;
       Scanner scanner = new Scanner(System.in);
       System.out.println("What station would you like to know about?");
       input = scanner.nextLine();
       printmessage(input);
   }
   
    
   public static void printmessage(String input)
   {
       Station s1 = new Station();//creates a new record called s1
       s1 = setName(s1,"Mile End");//stores name of the first station
       s1 = setZone(s1,2);//stores zone
       s1 = setAccess(s1,false);//states whether it is wheelchair accessible
       
       Station s2 = new Station();//creates new record called s2
       s2 = setName(s2,"Oxford Circus");//stores name of second station
       s2 = setZone(s2,1);//stores zone
       s2 = setAccess(s2,false);//states whether it is wheelchair accessible
       
       Station s3 = new Station();//creates a new record called s3
       s3 = setName(s3,"Woodford");//stores name of second station
       s3 = setZone(s3,4);//stores zone
       s3 = setAccess(s3,true);//states whether it is wheelchair accessible
       
       Station s4 = new Station();//creates a new record called s4
       s4 = setName(s4,"Kings Cross");//stores name of the first station
       s4 = setZone(s4,1);//stores zone
       s4 = setAccess(s4,true);//states whether it is wheelchair accessible
   
       if (input.equalsIgnoreCase("Mile End"))//will print the details of S1, if MILE END is typed
       {
           System.out.println(getName(s1) + " is in zone " + getZone(s1) + " " + getAccess(s1));
       }
       else if (input.equalsIgnoreCase("Oxford Circus"))//will print the details of S2, if OXFORD CIRCUS is typed
       {
           System.out.println(getName(s2) + " is in zone " + getZone(s2) + " " + getAccess(s2));
       }
       else if (input.equalsIgnoreCase("Woodford"))//will print the details of S3, if WOODFORD is typed
       {
           System.out.println(getName(s3) + " is in zone " + getZone(s3) + " " + getAccess(s3));
       }
       else if (input.equalsIgnoreCase("Kings Cross"))//will print the details of 
       {
           System.out.println(getName(s4) + " is in zone " + getZone(s4) + " " + getAccess(s4));
       }
       else
       {
           System.out.println("Sorry " + input + " station doesn't exist, please try another");
       }
   }   
           
   public static String getName (Station s)
   {
     return s.name;
   }

   public static int getZone (Station s)
   {
     return s.zone;
   }
   
   public static String getAccess (Station s)
   {
       if (s.access)
       {
          return "and there is wheelchair access";
       }
       else 
       {
        return "and there is no wheelchair access";
       }
   } //END
   
   public static Station setZone (Station s, int stationzone)
   {
     s.zone = stationzone;
     return s;
   }

   public static Station setName (Station s, String stationname)
   {
     s.name = stationname;
     return s;
   }
    
   public static Station setAccess (Station s, boolean hasaccess)
   {
     s.access = hasaccess;
     return s;
    } //END
}
class Station
{
   String name; 
   int zone;  
   boolean access;    
} 
