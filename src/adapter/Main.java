package adapter;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(AudioType.MP3, "file1.mp3");
        audioPlayer.play(AudioType.MP4, "file2.mp4");
        audioPlayer.play(AudioType.VLC, "file3.vlc");
        audioPlayer.play(AudioType.AVI, "file4.avi");
    }

}
