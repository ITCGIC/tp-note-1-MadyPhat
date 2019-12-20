package tp_note_1;

import java.util.Scanner;
    public class Task5{
    public static void main(String[] args) {
        System.out.print("Program for converting money in Riels to Dollars.\n ");
        Scanner rs = new Scanner(System.in);
        System.out.print("\tPlease input money in Riels: ");
        float Riels = rs.nextInt(); 
        float usd = (Riels)/4000;
        System.out.print("-------------------------------------------\n");
        System.out.print(Riels +" RIELS = " + usd +" USD");
    }
    }