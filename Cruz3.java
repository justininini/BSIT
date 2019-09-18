
import java.util.Scanner;


public class Cruz3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
       int sec,hr,min,seconds,a=60;
       
       System.out.println("Enter time in seconds:");
       seconds=in.nextInt();
       
       sec= seconds % a;
       hr= seconds / a;
       min= hr % a;
       hr/=a;
                          
       
       
       System.out.println("Time is " + hr + " hour " + min + " minute/s "+  sec + " seconds");
    }
}
