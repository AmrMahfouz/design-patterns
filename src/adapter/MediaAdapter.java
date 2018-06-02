package adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AudioType audioType) {
        switch (audioType) {
            case VLC:
                advancedMediaPlayer = new VLCPlayer();
                break;
            case MP4:
                advancedMediaPlayer = new MP4Player();
                break;
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType) {
            case VLC:
                advancedMediaPlayer.playVLC(fileName);
                break;
            case MP4:
                advancedMediaPlayer.playMP4(fileName);
                break;
        }
    }
}
