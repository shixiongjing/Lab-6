import java.util.Random;
import java.util.Scanner;
import java.io.IOException;


public class Officequest{
    
    public static void main(String[] args){
    	
    	Staple stap=new Staple();
        Tape tap=new Tape();
        Scanner sc = new Scanner(System.in);
        int turn=0;
        System.out.println("Welcome to Office Quest ! ");
        int fail=0;


        //set a while loop for the game to run 24 turns or lose
        while(turn<24&&fail==0){

            System.out.println("Turn: " + turn);
            int min=480-20*turn;
            int hour=min/60;
            int minute=min%60;
            System.out.println("You still have " + hour + " hour(s) " + minute + " minutes to go. ");
            stap.dispstaple();
            tap.disptape();
            

            //use random numbers to determine what happened next
            //aba53

            Random rng = new Random();
            int poss=rng.nextInt(100);
            if(poss<=5){
                tap.addtape();
                System.out.println("The deliver person come with more tape!");
            }
            else if(poss<=10){
                stap.addstaple();
                System.out.println("The deliver person come with more staple!");
            }
            else{
                int n=rng.nextInt(59);
                n=n+1;
                System.out.println("Someone drop "+n+" papers to collate!");

                //have paper to collate
                System.out.print("Tape or Staple? (T/S) >>");
                String choice=sc.next();
                while((!choice.equals("T"))&&(!choice.equals("S"))&&(!choice.equals("s"))&&(!choice.equals("t"))){
                    System.out.println("Invalid Input. Please type T or S");
                    choice=sc.next();
                }
                
                //apply players' choice
                if(choice.equals("T")||choice.equals("t")){
                    fail=tap.usetape(n);
                }
                else{
                    fail=stap.usestaple(n);
                }

            }

            ++turn;
            if(turn==24){
                System.out.println("You survived in the office! Cong!");
            }

        }
        
    	
        
    }
}