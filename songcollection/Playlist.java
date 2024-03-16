/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songcollection;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author RedietBerhe
 */
public  class Playlist implements SongInterface {

    static Playlist getGenre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    private Node head;
    private Song lastAddedSong;
    
    public Playlist(){
        this.head= null;
        this.lastAddedSong=null;
    }
    public Node getHead(){
        return head;
    }
    
    public void addSong(Song song) {
        Node newNode = new Node(song);
        if(head==null){
            head= newNode;
        }else{
            Node current = head;
            while(current.getNext() !=null){
                current = current.getNext();
            }
            current.SetNext(newNode);
        }
        lastAddedSong= song;
    }
    
   public void deleteSong(String title) {
        if(head==null){
            return;
        }
        if (head.getSong().getTitle().equals(title)){
            head=head.getNext();
            if(head==null){
                lastAddedSong=null;
            }
            return;
        }
        Node prev = null;
        Node current = head;
        while(current!=null&& !current.getSong().equals(title) ){
            prev = current;
            current = current.getNext();
        }
        if(current!=null){
            prev.setNext(current.getNext());
            if (current.getNext() == null) {
                lastAddedSong = prev.getSong();
            }
        }
        
    }
   
  @Override 
   public Song searchSong(String title) {
       Node current= head;
       while (current != null){
          if(current.getSong().getTitle().equalsIgnoreCase(title)){
              return current.getSong();
          }
           current= current.getNext();  
       }
       return null;
   }
    @Override
    public void printPlaylist() {      
        if(head== null){
           JOptionPane.showMessageDialog(null, "Liked plalist is empty");
            return;
        
    }  
    StringBuilder playlistText= new StringBuilder();
    Node current =  head;
    while(current!=null){
    playlistText.append(current.getSong()).append("\n");
    current = current.getNext();
    }
   
    JOptionPane.showMessageDialog(null, "Liked playlist:\n" + playlistText.toString());
}
  
    @Override
    public int countSongs(){
    if(head== null){
        JOptionPane.showMessageDialog(null, "Liked plalist is empty");
        return 0;
    }
    int likedCount = 0;
    Node current = head;
    while (current != null) {
        likedCount++;
        current = current.getNext();
    }

    JOptionPane.showMessageDialog(null, "Number of liked songs: " + likedCount);
    return likedCount;

    
    }
 
    
    // New method to get the last added song
    public Song getLastAddedSong() {
        return lastAddedSong;
    }

    public boolean containsSong(String title) {
        Node current = head;
        while (current != null) {
            if (current.getSong().getTitle().equals(title)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public void addSong(String title, String artist) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteSong(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

