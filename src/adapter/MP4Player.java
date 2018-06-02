package adapter;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        // do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("From MP4 Player playing : " + fileName);
    }
}
