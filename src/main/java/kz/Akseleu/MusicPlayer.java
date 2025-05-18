package kz.Akseleu;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){

    }

    public MusicPlayer(List<Music> musicList, String name, int volume) {
        this.musicList = musicList;
        this.name = name;
        this.volume = volume;
    }

    //IOC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    public void play() {
        for (Music music : musicList) {
            System.out.println("Playing: "+ music.getSong());
        }
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }
}
