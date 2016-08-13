/**
 * Created by frank on 8/13/16.
 * Belong to project headfirstjava
 */
class Player {
    static int playerCount = 0;
    private String name;

    public Player(String n){
        name = n;
        playerCount++;
    }

}
