/* AUTHOR Michael Han
This program prints my first initial and second initial
*/

import javax.swing.*;

class initialprogram
{
    public static void main (String[] param)
    {		
        firstinitial();
        space();
        secondinitial();
        System.exit(0);
		
    } // END main
    public static void firstinitial ()
    {
        // Create 5 string variables
        String line1;
        String line2;
        String line3;
        String line4;
        String line5;

        
        //assign data to each string variable (each line of my first initial)
        line1 = "M    M";
        line2 = "MM  MM";
        line3 = "M MM M";
        line4 = "M    M";
        line5 = "M    M";
       
        
        //print out the final result
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);

        //Note giving the variable name here is as though the whole message was typed here
        return;
    } // END firstinitial
    public static void space ()
    {        //create a space between initials
        String space;//creates a string for a line between each initial
        
        space = "";//assigns a blank line to the string
        
        System.out.println(space);//prints space
        
        return;
        
    }//END space
        
        public static void secondinitial ()
    {
        // Create 5 string variables 
        String line6;
        String line7;
        String line8;
        String line9;
        String line10;

        
        // assign data to each string variable (each line of my second initial
        line6 = "H    H";
        line7 = "H    H";
        line8 = "HHHHHH";
        line9 = "H    H";
        line10 = "H    H";
       
        
        // print out the final result
        System.out.println(line6);
        System.out.println(line7);
        System.out.println(line8);
        System.out.println(line9);
        System.out.println(line10);

        return;
     } // END secondinitial

} // END class initialprogram
