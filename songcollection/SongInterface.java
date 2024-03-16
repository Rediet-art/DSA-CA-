/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package songcollection;

/**
 *
 * @author RedietBerhe
 */
public interface SongInterface  {

    public boolean isEmpty();
    
    public int size();
    
    public void addSong(String title,String artist);

    public void deleteSong(int index);

    public Song searchSong(String title);

    public void printPlaylist();
    
    public int countSongs();

   

 

    
}

