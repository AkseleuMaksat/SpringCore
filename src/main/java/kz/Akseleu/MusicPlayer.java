package kz.Akseleu;

public class MusicPlayer {
    private Music music;
    //IOC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void play() {
        System.out.println("Playing: "+music.getSong());
    }
}
