package tp_note_1;

import java.util.*;
 public class Task3 {
 public static void main(String[] args)
    {
        System.out.print("Program for converting time to seconds.\n" );
        
        //Get hours
        Scanner hr = new Scanner(System.in);
        System.out.print("\t\tPlease input hours: ");
        int hours = hr.nextInt(); 
        //Get minute
        Scanner mn = new Scanner(System.in);
        System.out.print("\t\tPlease input minutes: ");
        int minutes = mn.nextInt();
        //Get Seconds
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tPlease input seconds: ");
        int seconds = sc.nextInt();
        //Calculation
        int p1 = hours * 3600;
        int p2 = minutes * 60;
        int p3 = seconds;
        int total = p1 + p2 + p3;
        //Display result
        System.out.print("---------------------------------------------------------------\n");
        System.out.print( "\t\tNumber of seconds = "+ hours +"x3600 + "+ seconds + "x60 + " + seconds + " = " + total);
		System.out.print("\n");
    }    
 }