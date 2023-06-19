package BT3;

public class VideoPlayer implements Playable {
    @Override
    public void play(String str) {
        System.out.println("Play Video: "+str);
    }
}
