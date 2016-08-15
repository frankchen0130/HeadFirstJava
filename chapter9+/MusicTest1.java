/**
 * Created by frank on 8/13/16.
 * Belong to project headfirstjava
 */
import javax.sound.midi.*;
public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequence = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequence");
        } catch(MidiUnavailableException ex){
            System.out.println("Bummer");
        }
    }

    public static void main(String[]args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
