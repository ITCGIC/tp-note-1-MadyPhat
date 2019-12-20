package tp_note_1;

import java.util.*;
 public class Task4 {
 public static void main(String[] args)
    {
        System.out.print("Program for calculating cost of a call.\n" );
        
        //Get start hours
        Scanner shr = new Scanner(System.in);
        System.out.print("\tPlease input start hours: ");
        int Shours = shr.nextInt(); 
        //Get start minute
        Scanner smn = new Scanner(System.in);
        System.out.print("\tPlease input start minutes: ");
        int Sminutes = smn.nextInt();
        //Get start Seconds
        Scanner ssc = new Scanner(System.in);
        System.out.print("\tPlease input start seconds: ");
        int Sseconds = ssc.nextInt();

        //Get end hours
        Scanner ehr = new Scanner(System.in);
        System.out.print("\tPlease input end hours: ");
        int Ehours = ehr.nextInt(); 
        //Get end minute
        Scanner emn = new Scanner(System.in);
        System.out.print("\tPlease input end minutes: ");
        int Eminutes = emn.nextInt();
        //Get end Seconds
        Scanner esc = new Scanner(System.in);
        System.out.print("\tPlease input end seconds: ");
        int Eseconds = esc.nextInt();

        //Calculation_Start_Times_Into_Seconds
        int s1 = Shours * 3600;
        int s2 = Sminutes * 60;
        int s3 = Sseconds;
        int totalStart = s1 + s2 + s3;

        //Calculation_End_Times_Into_Seconds
        int e1 = Ehours * 3600;
        int e2 = Eminutes * 60;
        int e3 = Eseconds;
        int totalEnd = e1 + e2 + e3;

        //Calculate_Total_Talk_Times
        int total = totalEnd - totalStart;

        //Convert to times formate
        int t1 = total % 60;
        int t2 = total / 60;
        int t3 = t2 % 60;
        t2 = t2 / 60;


        //Calculate_cost
        double cost = (total* 0.05)/60;

        //Display result
        System.out.print("---------------------------------------------------------------\n");
        System.out.print("Total call diration: " + t2 +" h " + t3 + "mn " + t1 +"s\n");
        System.out.print("Total cost of this call: "+ cost + "$");
    }    
 }