package adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType) {
            case MP3:
                System.out.println("From Audio Player playing : " + fileName);
                break;
            case MP4:
            case VLC:
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                System.out.println("Invalid Media File " + fileName + ", " + audioType + " Not Supported");
        }
    }
}
