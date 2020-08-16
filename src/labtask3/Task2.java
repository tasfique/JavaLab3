//Name-Tasfique
//Student ID-5886429
//Task2
package labtask3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //declaration of variables
        double rate, hours, grosspay, tax, netpay;
        Scanner read = new Scanner (System.in);
        
        System.out.println("Employee Salary Calculation");
        System.out.println("----------------------------");
        System.out.println("Enter the following details:");
        
        //inputting data
        System.out.println("Hourly Pay Rate: ");
        rate = read.nextDouble();
        System.out.println("Hours Worked: ");
        hours = read.nextDouble();
        
        //calculation
        grosspay = rate*hours;
        if(grosspay<=3000){
           tax = grosspay*0.10;
           netpay = grosspay-tax;
            
         }else if(grosspay>3000 && grosspay<=4000) {
            tax = grosspay*0.12;
            netpay = grosspay-tax;
           
         }else if(grosspay>4000 && grosspay<=5000) {
             tax = grosspay*0.15;
             netpay = grosspay-tax;
             
         }else {
             tax = grosspay*0.20;
             netpay = grosspay-tax;
                
           
         }
       System.out.println("Payment details:");
       System.out.println("Gross Pay              RM:"+grosspay);
       System.out.println("Withholding Tax Amount RM:"+tax);
       System.out.println("Net Pay                RM:"+netpay); 
       
    }
    
}