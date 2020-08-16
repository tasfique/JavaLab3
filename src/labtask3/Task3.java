//Name-Tasfique
//Student ID-5886429
//Task3
package labtask3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //declaration of variables
        int number;
        int sum=0;
        Scanner read = new Scanner (System.in);
        
        //inputting data
        System.out.println("Enter a positive integer: ");
        number = read.nextInt();        
        
        //calculation
       while ( number < 0){
           System.out.println("You have entered an invalid value!!!");
           System.out.println("Enter a positive integer: ");
           number = read.nextInt();
           //number ++;
       }
       for (int i =1; i<= number; i++)
       {
           //sum += i;
           sum = sum+i;
       }
       System.out.println("The sum of all numbers from 1 to "+number+" is "+sum);
           
        
        
    }
    
}