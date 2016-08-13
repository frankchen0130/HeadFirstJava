/**
 * Created by frank on 8/5/16.
 * Belong to project headfirstjava
 */
import java.util.*;
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void  SetUpGame(){

        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);

            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!dotComList.isEmpty()){

            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){

        numOfGuess++;

        String result = "miss";

        for (DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourself(userGuess);

            if(result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.print("All Dot Coms are dead! your stock is now worthless.");
        if(numOfGuess <= 18){
            System.out.println("It only took you " + numOfGuess + " guesses.");
            System.out.println(" You got out before yoopur opitions sank.");
        } else{

            System.out.println("Took you long ength. "+ numOfGuess + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String [] args){
        DotComBust game = new DotComBust();
        game.SetUpGame();
        game.startPlaying();
    }
}
