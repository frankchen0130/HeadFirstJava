/**
 * Created by frank on 7/23/16.
 */
public class GoodDog {
    private int size;
    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){if (size > 60){
            System.out.println("Woof!");
        } else if (size > 14){
            System.out.println("Ruff!");
        } else{
            System.out.println("Tip!");
        }

    }

}
