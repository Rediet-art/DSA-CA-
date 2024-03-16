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


    public void addSong(String title,String artist);

    public void deleteSong(int index);

    public void searchSong(String title);

    public void printPlaylist();
    
    public int countSongs();

    public void setRepeat();

    public void addLastSongToGenre();

    
}

