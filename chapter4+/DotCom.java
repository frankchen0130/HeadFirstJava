import java.util.ArrayList;

/**
 * Created by frank on 8/5/16.
 * Belong to project headfirstjava
 */
import java.util.*;
public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        int index = locationCells.indexOf(guess);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "  :( ");
            } else{
                result = "hit";
            }
        }

//        for (int cell : locationCells) {
//            if (guess == cell){
//                result = "hit";
//                numOfHits ++;
//                break;
//            }
//        }
//        if (numOfHits == locationCells.length){
//            result = "kill";
//        }

//        System.out.println(result);
        return result;
    }

}
