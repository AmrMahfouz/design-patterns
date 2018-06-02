package adapter;

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("From VLC Player Playing File : " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        // do nothing
    }
}
