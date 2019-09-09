import java.util.Scanner;


public class Cruz1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double price= 12.00 , topping= 1.50, tax = 0.05;
        
        double pizzanum, toppingsnum, total ,secttl, thirdttl;
        
        System.out.println("Input:");
        System.out.println("");
        System.out.print("Enter number of pizzas:");
        pizzanum = in.nextInt();
        
        System.out.print("Enter total number of toppings:");
        toppingsnum = in.nextInt();
        
        total= (pizzanum*price) + (toppingsnum*topping);
        secttl= (total*tax);
        thirdttl= (secttl + total);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Output:");
         System.out.println("Receipt: Number of Pizzas:" + pizzanum);
         System.out.println("Receipt: Number of Toppings:" + toppingsnum);
         System.out.println("Total (incl tax):" + thirdttl);
        
    }
    
}
