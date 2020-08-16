//Name-Tasfique
//Student ID-5886429
//Task4
package labtask3;

public class Task4 {
    public static void main(String[] args) {
        //declaration of variable
        double mem = 2500;
        double increase = 0.04;
        
        //inputting data
        System.out.println("The current rate is RM2500");
        System.out.println("The projected rate for the next six years :");
        
       //calculation
      for (int i = 1; i <= 6; i++){
         mem = mem + (mem* increase); //mem += (mem * increase); 
             System.out.println("Year "+i+" : "+mem);
      }  
    }
    
}