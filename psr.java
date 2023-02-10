import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

import org.w3c.dom.ls.LSException;
   public class psr {

    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHello and welcome to the game");
        System.out.println("\nwhen i say rock paper scissor you choose one too");
        System.out.println("ARE YOU READY TO PLAY? (yes / no)");

        String ready = scan.nextLine();

        if(ready.equals("yes"))
        {
          System.out.println("\nGreat lets rock and roll");
          System.out.println("\n...Rock / Paper / Scissor...");
          String yourChoise = scan.nextLine();
          
          String computerChoise = computerChoise();

          String finalResult = result(yourChoise, computerChoise);
          resultPrinter(yourChoise, computerChoise, finalResult);
        }

        else 
        {
          System.out.println("Offf Maybe another time...BYE");
        }

    }

    public static String computerChoise()
    {
         double randNum = Math.random() * 3;
         int intRandNum = (int)randNum;

         switch(intRandNum)
         {
           case 0:
           return "rock";
           case 1:
           return "paper";
           case 2:
           return "scissor";
           default:
           return "404";
         }
    }


    public static String result(String yourChoise , String computerChoise)
    {
        if(yourChoise.equals("rock") && computerChoise.equals("scissor"))
        {
            finalResult ="You Win...";
        }
        else if(yourChoise.equals("rock") && computerChoise.equals("paper"))
        {
            finalResult ="You Lose...";
        }
        else if(yourChoise.equals("paper") && computerChoise.equals("rock"))
        {
            finalResult ="You Win...";
        }
        else if(yourChoise.equals("paper") && computerChoise.equals("scissor"))
        {
            finalResult ="You Lose...";
        }
        else if(yourChoise.equals("scissor") && computerChoise.equals("rock"))
        {
            finalResult ="You Lose...";
        }
        else if(yourChoise.equals("scissor") && computerChoise.equals("paper"))
        {
            finalResult ="You Win...";
        }
        else
        {
        finalResult ="Its a Tie...";
        }
       
      return finalResult;
    }


    public static void resultPrinter(String yourChoise , String computerChoise , String finalResult)
    {
        System.out.println("you chose <<" + yourChoise + ">> and the computer chose <<"+ computerChoise + ">>...");       
        System.out.println(finalResult);
    }

    public static String finalResult;
    
}