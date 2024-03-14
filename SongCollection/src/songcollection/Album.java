/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songcollection;

import java.util.ArrayList;

/**
 *
 * @author RedietBerhe
 */
public class Album {
    private String name;
    private ArrayList<Song> songs;
    
    public Album(String name, ArrayList<Song> songs){
        this.name =name;
        this.songs= new ArrayList<Song>();
        
        
    } 
       public void addSong(Song song) {
        songs.add(song);
    }

    public void deleteSong(int index) {
        songs.remove(index);
    }

    public int countSongs() {
        return songs.size();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
    
}
