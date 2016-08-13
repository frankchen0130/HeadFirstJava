/**
 * Created by frank on 8/11/16.
 * Belong to project headfirstjava
 */
public class Boat {
    private int length;

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void move(){
        System.out.print("drift ");
    }
}
