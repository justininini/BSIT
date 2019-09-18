
import java.util.Scanner;


public class Cruz2 {
    
    public static void main(String[]args){
        
        Scanner in=new Scanner(System.in);
        double a,b,c;
        
        System.out.println("Enter the driving distance:");
        a=in.nextDouble();
        System.out.println("Enter Miles per gallon:");
        b=in.nextDouble();
        System.out.println("Enter price per Gallon:");
        c=in.nextDouble();
        
       
        
        System.out.printf("The cost of driving is %.2f ", a/b*(c));
        
    }
}
