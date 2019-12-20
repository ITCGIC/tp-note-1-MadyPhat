package tp_note_1;

import java.util.*;
 public class Task2 {
 public static void main(String[] args)
    {
        System.out.print("Program for converting second into formated H:M:S\n" );
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tInput number of seconds: ");
		int seconds = sc.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( "\t\tTime corresponding to "+ seconds +"seconds is "+ p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
    }    
 }