/**
 * Created by frank on 7/23/16.
 */
public class TestArrays {
    public static void main(String [] args) {
        int y = 0;

        int ref;
        String [] islands = new String[4];

        int [] index  = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        while (y < 4) {
            System.out.print("island = ");
            ref = index[y];
            System.out.println(islands[ref]);

            y += 1;
        }



    }
}
