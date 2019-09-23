import java.util.Scanner;
import java.util.Random;
public class Cruz4 {
    
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        Random random= new Random ();
        
        System.out.println("Rock: 0 Scissors: 1 Paper: 2");
        System.out.print("Choose:");
        int player= in.nextInt();
        
          switch(player){
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Scissors");
                break;
            case 2:
                System.out.println("Paper");
                break;
            default:System.out.println("invalid");
             break;
        }
          
        int comp= (int)(Math.random()*2);
        System.out.println("The computer chooses: " + comp);
        
            switch(comp){
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Scissors");
                break;
            case 2:
                System.out.println("Paper");
                break;
            default:System.out.println(" invalid");
             break;
        }       
     
        
        if(player ==1 && comp ==0){
            System.out.println("Computer wins");
        }
        else if(player ==1 && comp ==2){
            System.out.println("Player wins");
        }
        else if(player ==1 && comp ==1){
            System.out.println("Draw");
        }
        else if(player ==2 && comp ==1){
            System.out.println("Computer wins");
        }
        else if(player ==2 && comp ==2){
            System.out.println("Draw");
        }
        else if(player ==2 && comp ==0){
            System.out.println("Player wins");
        }
        else if(player ==0 && comp ==0){
            System.out.println("Draw");
        }
        else if(player ==0 && comp ==1){
            System.out.println("Player wins");
        }
        else if(player ==0 && comp ==2){
            System.out.println("Computer wins");
        }
        else{
            System.out.println("invalid");
        }
        
    }
}
