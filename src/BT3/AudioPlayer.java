package BT3;

public class AudioPlayer implements Playable {
    @Override
    public void play(String str) {
        System.out.println("Play Audio: "+str);
    }
}
