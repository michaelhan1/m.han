
/**
 * Write a description of class art here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class art
{ 
   public static void main(String[] param)
   {
       String[] title = titles();  
       int[] date = dates();
       String[] artist = artists();
       Painting p1 = painting(title, date, artist, 1);
       Painting p2 = painting(title, date, artist, 2);
       Painting p3 = painting(title, date, artist, 3);
       Painting p4 = painting(title, date, artist, 4);
       ArtCollection collection=new ArtCollection();
       Painting[] listOfPaintings={p1,p2,p3,p4};
       collection.paintingsList=listOfPaintings;
       print(collection);
   }
   
   public static int roomNumber(String message)
   //this method will take user input and return it to the main method
   {
       int input;//declares the variable input as an integer
       Scanner scanner = new Scanner(System.in);//creates a scanner variable
       System.out.println("What room are you in?");
       input = Integer.parseInt(scanner.nextLine());
       //store which room number the user is in and returns it
       return input;
   }
   
   public static String[] titles()
   {
       final String[] title = new String[4];
       //creates a new array called title and stores the names of the films,
       title[0] = "Woman with a Pearl Necklace";//name 1
       title[1] = "Self-Portrait with Beret and Turner-Up Collar";//name 2
       title[2] = "Girl with Chrysanthemums";//name 3
       title[3] = "Impression, Sunrise";//name 4
       return title;
   }
   
   public static int[] dates()
   {
       final int[] date = new int[4];
       //creates a new array called date and stores the dates of the art pieces
       date[0] = 1879;
       date[1] = 1659;
       date[2] = 1894;
       date[3] = 1872;
       return date;
   }
   
   public static String[] artists()
   {
       final String[] artist = new String[4];
       //creates a new array called artist and stores the names of the artist
       artist[0] = "Mary Cassatt";
       artist[1] = "Rembrandt";
       artist[2] = "Olga Boznanska";
       artist[3] = "Claude Monet";
       return artist;
   }
   
   public static int[] GalleryNumber()
   {
       final int[] gallery = new int[4];
       gallery[0] = 1;
       gallery[1] = 2;
       gallery[2] = 3;
       gallery[3] = 4;
       return gallery;
   }
   
   public static Painting painting(String[] title, int[] date, String[] artist, int paintingNo)
   {
       paintingNo = paintingNo - 1; //makes paintingNo zero based, so accesses the arrays properly.
       Painting p1 = new Painting();//creates a new record
       p1 = setTitle(p1,title[paintingNo]);//uses setter methods to set the title to corresponding array
       p1 = setDate(p1,date[paintingNo]);//uses setter methods to set the date to corresponding array
       p1 = setArtist(p1,artist[paintingNo]);//uses setter methods to set the artist to corresponding array
       return p1;
   }
   
   
   public static void print(ArtCollection collection)
   {
       int input = 0;
       while(input != -1)
       //states that is user input is -1, close the program
       {
           input = roomNumber("What room are you in?");
           if (input == 1)
           //if user input =1, get the values of first array in each 
           {
               System.out.println( getTitle(collection.paintingsList[0]) + ". It was painted in " + getDate(collection.paintingsList[0]) + " by " + getArtist(collection.paintingsList[0]));
           }
           else if (input == 2)
           //if user input =1, get the values of second array in each 
           {
               System.out.println(getTitle(collection.paintingsList[1]) + ". It was painted in " + getDate(collection.paintingsList[1]) + " by " + getArtist(collection.paintingsList[1]));
           }
           else if (input == 3)
           //if user input =1, get the values of third array in each 
           {
               System.out.println( getTitle(collection.paintingsList[2]) + ". It was painted in " + getDate(collection.paintingsList[2]) + " by " + getArtist(collection.paintingsList[2]));
           }
           else if (input == 4)
           //if user input =1, get the values of fourth array in each 
           {
               System.out.println( getTitle(collection.paintingsList[3]) + ". It was painted in " + getDate(collection.paintingsList[3]) + " by " + getArtist(collection.paintingsList[3]));
           }
           else if(input >= 5 || input <=-2)
           //if input is less outsides the range, print message
           {
               System.out.println("I dont have that many rooms in my gallery");
           }
               
       }
       System.out.println("closing down");
   }   
   
   public static String getTitle (Painting p)
   {
     return p.title;
   }

   public static int getDate (Painting p)
   {
     return p.date;
   }
   
   public static String getArtist (Painting p)
   {
     return p.artist;
   } //END
   
   public static Painting setDate (Painting p, int artDate)
   {
     p.date = artDate;
     return p;
   }

   public static Painting setTitle (Painting p, String artTitle)
   {
     p.title = artTitle;
     return p;
   }
    
   public static Painting setArtist (Painting p, String artArtist)
   {
     p.artist = artArtist;
     return p;
    } //END
    
}

class Painting
//initialises variables to be used in the record
{
   //each variable is declared as their type
   String title;
   int date;  
   String artist;    
} 

class ArtCollection
{
    Painting[] paintingsList;
}

