/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package songcollection;
import javax.swing.JComboBox;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author RedietBerhe
 */
public class SongGUI extends javax.swing.JFrame {
    private MusicManager musicManager;
   private Song lastAddedSong;
    /**
     * Creates new form SongGUI
     */
    public SongGUI() {
       musicManager = new MusicManager ();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayBTN = new javax.swing.JButton();
        titleLBL = new javax.swing.JLabel();
        deleteBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        searchBTN = new javax.swing.JButton();
        nameLBL = new javax.swing.JLabel();
        sNameTF = new javax.swing.JTextField();
        exitBTN = new javax.swing.JButton();
        listBTN = new javax.swing.JButton();
        moveBTN = new javax.swing.JButton();
        addLikedBTN = new javax.swing.JButton();
        genreLBL = new javax.swing.JLabel();
        artistLBL = new javax.swing.JLabel();
        artistTF = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        clearBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });
        getContentPane().add(displayBTN);
        displayBTN.setBounds(36, 289, 72, 23);

        titleLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(255, 153, 153));
        titleLBL.setText("Playlist");
        getContentPane().add(titleLBL);
        titleLBL.setBounds(161, 16, 229, 34);

        deleteBTN.setForeground(new java.awt.Color(255, 0, 0));
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBTN);
        deleteBTN.setBounds(429, 289, 94, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(36, 330, 563, 121);

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        getContentPane().add(searchBTN);
        searchBTN.setBounds(36, 457, 72, 36);

        nameLBL.setText("Song Title ");
        getContentPane().add(nameLBL);
        nameLBL.setBounds(44, 65, 55, 16);

        sNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTFActionPerformed(evt);
            }
        });
        getContentPane().add(sNameTF);
        sNameTF.setBounds(161, 62, 151, 22);

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(exitBTN);
        exitBTN.setBounds(448, 463, 72, 23);

        listBTN.setText("Liked songs List");
        listBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBTNActionPerformed(evt);
            }
        });
        getContentPane().add(listBTN);
        listBTN.setBounds(429, 248, 113, 23);

        moveBTN.setText("Move Last liked Songs");
        moveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBTNActionPerformed(evt);
            }
        });
        getContentPane().add(moveBTN);
        moveBTN.setBounds(36, 197, 147, 23);

        addLikedBTN.setText("Add Liked song");
        addLikedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLikedBTNActionPerformed(evt);
            }
        });
        getContentPane().add(addLikedBTN);
        addLikedBTN.setBounds(36, 248, 112, 23);

        genreLBL.setText("Song Genre");
        getContentPane().add(genreLBL);
        genreLBL.setBounds(44, 99, 61, 16);

        artistLBL.setText("Song Artist");
        getContentPane().add(artistLBL);
        artistLBL.setBounds(44, 127, 58, 16);
        getContentPane().add(artistTF);
        artistTF.setBounds(161, 124, 151, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hip Hop", "Rock" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(161, 96, 79, 22);

        clearBTN.setText("Clear fields ");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        getContentPane().add(clearBTN);
        clearBTN.setBounds(425, 197, 110, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/songcollection/music.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 4, 630, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
       

    }//GEN-LAST:event_displayBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        String title= sNameTF.getText();
        if(!title.isEmpty()){
            jTextArea1.append("Please enter a title to search.");
        }else{
            Song song= musicManager.searchSong(title);
        if(song!=null) {
            if (song.getTitle().equalsIgnoreCase(title)) {
             jTextArea1.append(title + " was found in the list\n");
            }else {
             jTextArea1.append(title + " was not found in the list\n");
            }
        }
     }
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        String title= sNameTF.getText();
        musicManager.getLikedPlaylist().deleteSong(title);
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void listBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBTNActionPerformed
          String[] options = {"Liked Playlist", "Genre Playlists"};
          String choice = (String) JOptionPane.showInputDialog(null, "Select playlist to print:",
        "Print Playlist", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    if (choice != null) {
        if (choice.equals("Liked Playlist")) {
            Playlist likedPlaylist = musicManager.getLikedPlaylist();
            if (likedPlaylist.getHead() == null) {
                jTextArea1.append( "Liked Playlist is empty. No songs to display.");
            } else {
                likedPlaylist.printPlaylist();
            }
        } else if (choice.equals("Genre Playlists")) {
            boolean allEmpty = true;
            StringBuilder message = new StringBuilder("Genre Playlists:\n");
            for (Genre genrePlaylist : musicManager.getGenrePlaylists()) {
                if (genrePlaylist.getHead() != null) {
                    allEmpty = false;
                    message.append("Genre: ").append(genrePlaylist.getGenre()).append("\n");
                    genrePlaylist.printPlaylist();
                }
            }
            if (allEmpty) {
                jTextArea1.append("Genre Playlists are all empty. No songs to display.");
            }
        }
    }  
    }//GEN-LAST:event_listBTNActionPerformed

    private void addLikedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLikedBTNActionPerformed
            // If user clicks OK, create a new song and add it to liked playlist
        
            String title = sNameTF.getText();
            String artist = artistTF.getText();
            String genre = (String)jComboBox1.getSelectedItem();
            musicManager.getLikedPlaylist().addSong(new Song(title,artist));
            lastAddedSong=new Song(title,artist);
             jTextArea1.append("Song added to Liked Playlist: " + genre +"\n");
            
    }//GEN-LAST:event_addLikedBTNActionPerformed

    private void sNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameTFActionPerformed

    private void moveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBTNActionPerformed
            String title = sNameTF.getText();
            String artist = artistTF.getText();
            if (!musicManager.getLikedPlaylist().containsSong(title)) {
                    jTextArea1.append("Song does not exist in the Liked Playlist.");
                    return;
                }
                String[] genres = {"Hip Hop", "Rock"}; // Add more genres if needed
                JComboBox<String> genreComboBox = new JComboBox<>(genres);
                int result = JOptionPane.showConfirmDialog(null, genreComboBox, "Select Genre", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    String selectedGenre = (String) genreComboBox.getSelectedItem();
                    musicManager.moveLastAddedSongToGenrePlaylist(selectedGenre);
                }
        
    }//GEN-LAST:event_moveBTNActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         String[] genrePlaylistNames = {"Genre Playlist 1", "Genre Playlist 2"};
         Playlist selectedPlaylist = Playlist.getGenre();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        sNameTF.setText(null);
        artistTF.setText(null);
        jComboBox1.getSelectedItem();
        
    }//GEN-LAST:event_clearBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SongGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLikedBTN;
    private javax.swing.JLabel artistLBL;
    private javax.swing.JTextField artistTF;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel genreLBL;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton listBTN;
    private javax.swing.JButton moveBTN;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField sNameTF;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}











