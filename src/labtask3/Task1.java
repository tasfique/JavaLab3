//Name-Tasfique
//Student ID-5886429
//Task1
package labtask3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //declaration of variables
        double price, order, under;
        Scanner read = new Scanner (System.in);
        
        //inputting data
        System.out.println("Enter unit price: RM");
        price = read.nextDouble();
        System.out.println("Enter quantity ordered: ");
        order = read.nextDouble();
        
        //calculation
        if(order<=100){
            double less = price*1;
            under = less*order;
            System.out.println("Total cost: RM"+under);
         }else if (order>100){
            double over = (price*0.75)*(order-100);
            double under1 = price*(order - (order-100));
            double finaloutput = (over+under1);
            
            System.out.println("Total cost: RM"+finaloutput);
            
        }
       
    }
    
}