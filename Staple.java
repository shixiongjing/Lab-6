import java.util.Random;
import java.util.Scanner;

public class Staple{
    //set scanner and variables
    Scanner sc = new Scanner(System.in);
    private int staples;
    
    //construction method
    public Staple(){
    	staples=10;
    	}

    //method to use staple
    public int usestaple(int n){
        if(n<=50){
            staples=staples-1;
        }
        else{
            staples=staples-3;
        }
        int fail=0;
        if(staples<0){
            fail=1;
            System.out.println("You run out of staples!");
            System.out.println("You lose the game!");
        }
        return fail;
    }
    	
    //method to display staple    
    public void dispstaple(){
        if(staples>=10){
            System.out.println("The stapler feels really heavy!");
        }
        else if(staples>5){
            System.out.println("The stapler feels heavy");
        }
        else if(staples>0){
            System.out.println("The stapler feels light");
        }
        else{
            System.out.println("The stapler feels really light");
        }
    }

    //method to add staple
    public void addstaple(){
        staples+=10;
    }

        
    
}