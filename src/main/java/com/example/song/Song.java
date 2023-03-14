// Write your code here
package com.example.song;

public class Song{
    private int songId;
    private String singer;
    private String songName;
    private String lyricist;
    private String musicDirector;

    public Song(int id,String name,String lyricist,String singer,String music){
        songId=id;
        this.singer=singer;
        songName=name;
        this.lyricist=lyricist;
        musicDirector=music;
    }

    public String getMusicDirector(){
        return musicDirector;
    }

    public void setMusicDirector(String music){
        musicDirector=music;
    }
    public int getSongId(){
        return songId;
    }
    public String getSinger(){
        return singer;
    }
    public  String getSongName(){
        return songName;
    }
    public String getLyricist(){
        return lyricist;
    }
    public void setSongId(int id){
        songId=id;
    }
    public void setSinger(String singer){
        this.singer=singer;
    }
    public void setSongName(String name){
        songName=name;
    }
    public void setLyricist(String lyricist){
        this.lyricist=lyricist;
    }
}