import java.util.ArrayList;

/**
 * Created by frank on 8/4/16.
 * Belong to project headfirstjava
 */
public class SimpleDotCom {

    private ArrayList<String> locationCells;
    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYouself(String userInput){
//        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
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

        System.out.println(result);
        return result;
    }

}
