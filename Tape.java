import java.util.Random;
import java.util.Scanner;

public class Tape{
        //set scanner
        Scanner sc = new Scanner(System.in);
        //set variables
    	private double tape;

        //construction method
        public Tape(){
            tape=50;
        }
    	
        //method to use tape
    	public int usetape(int n){
            int fail=0;
            tape-=0.25*(double)(n);
            if(tape<=0){
                fail=1;
                System.out.println("You run out of tape!");
                System.out.println("You lose the game!");
            }
            return fail;
        }
    	
        //method to display tape condition
        public void disptape(){
        	if(tape>=45){
                System.out.println("The Tape Dispenser looks full!");
            }
            else if(tape>=35){
                System.out.println("The Tape Dispenser is almost full");
            }
            else if(tape>=15){
                System.out.println("The Tape Dispenser is about half way full");
            }
            else if(tape>0){
                System.out.println("The Tape Dispenser is almost empty");
            }
            else{
                System.out.println("The Tape Dispenser is empty");
            }
        }

        //method to add tape
        public void addtape(){
        	tape=50;
        }

        
}
