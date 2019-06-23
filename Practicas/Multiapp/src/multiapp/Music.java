
package multiapp;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan José Méndez Torrero
 */
public class Music extends javax.swing.JFrame {
    
    public boolean isplayed = false;
    String canciones[] = new String[8];
    Random rand = new Random();
    int song = rand.nextInt(8);
    static Icon favorites[] = new Icon[4];
    int numFav = 0;
    
    /**
     * Function that returns the vector favorites.
     * 
     */
    public static Icon[] getFavorites(){
        return favorites;
    }
    /**
     * Function that initializes all songs in order to set a random image into the three jLabels.
     * 
     */
    public void initializeSongs(){
        
        
        canciones[0] =  "/images/cancion1.png";
        canciones[1] = "/images/cancion2.png";
        canciones[2] = "/images/cancion3.png";
        canciones[3] = "/images/cancion4.png";
        canciones[4] =  "/images/cancion5.png";
        canciones[5] = "/images/cancion6.png";
        canciones[6] = "/images/cancion7.png";
        canciones[7] = "/images/cancion8.png";
        
        ImageIcon ii = new ImageIcon(getClass().getResource(canciones[song]));
        Image image = ii.getImage().getScaledInstance(portada1.getWidth(), portada1.getHeight(), Image.SCALE_SMOOTH);
        ii = new ImageIcon(image);
        portada1.setIcon(ii);
        
        song = rand.nextInt(8);
        ImageIcon ii2 = new ImageIcon(getClass().getResource(canciones[song]));
        Image image2 = ii2.getImage().getScaledInstance(portada2.getWidth(), portada2.getHeight(), Image.SCALE_SMOOTH);
        ii2 = new ImageIcon(image2);
        portada2.setIcon(ii2);
        
        song = rand.nextInt(8);
        ImageIcon ii3 = new ImageIcon(getClass().getResource(canciones[song]));
        Image image3 = ii3.getImage().getScaledInstance(portada3.getWidth(), portada3.getHeight(), Image.SCALE_SMOOTH);
        ii3 = new ImageIcon(image3);
        portada3.setIcon(ii3);
    }

    public Music() {
        initComponents();
        initializeSongs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        portada3 = new javax.swing.JLabel();
        portada1 = new javax.swing.JLabel();
        portada2 = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        favoritos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-icon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel1.setText("Ver Favoritos");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Música");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        fondo.setBackground(new java.awt.Color(204, 255, 255));

        portada3.setText("Cancion1");

        portada1.setText("Cancion1");

        portada2.setText("Cancion1");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(portada2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(portada3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(portada1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(367, Short.MAX_VALUE)))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portada2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portada3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(portada1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                previousMouseReleased(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextMouseReleased(evt);
            }
        });

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playMouseReleased(evt);
            }
        });

        favoritos.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        favoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        favoritos.setText("Añadir");
        favoritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                favoritosMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(previous)
                                .addGap(38, 38, 38)
                                .addComponent(play)
                                .addGap(43, 43, 43)
                                .addComponent(next)
                                .addGap(68, 68, 68)
                                .addComponent(favoritos))
                            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(previous, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(favoritos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function that set Home screen visible.
     * 
     */
    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseReleased

    /**
     * Function that set Play Icon into playing or paused.
     * 
     */
    private void playMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseReleased
        if(isplayed == false){
            ImageIcon ii3 = new ImageIcon(getClass().getResource("/images/pause.png"));
            Image image3 = ii3.getImage().getScaledInstance(play.getWidth(), play.getHeight(), Image.SCALE_SMOOTH);
            ii3 = new ImageIcon(image3);
            play.setIcon(ii3);
            isplayed=true;
        }else{
            ImageIcon ii3 = new ImageIcon(getClass().getResource("/images/play.png"));
            Image image3 = ii3.getImage().getScaledInstance(play.getWidth(), play.getHeight(), Image.SCALE_SMOOTH);
            ii3 = new ImageIcon(image3);
            play.setIcon(ii3);
            isplayed=false;
        }
        
    }//GEN-LAST:event_playMouseReleased

    /**
     * Function that moves all the images of the songs to the right.
     * 
     */
    private void previousMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseReleased
        portada1.setIcon(portada2.getIcon());
        portada2.setIcon(portada3.getIcon());
        song = rand.nextInt(8);
        ImageIcon ii3 = new ImageIcon(getClass().getResource(canciones[song]));
        Image image3 = ii3.getImage().getScaledInstance(portada3.getWidth(), portada3.getHeight(), Image.SCALE_SMOOTH);
        ii3 = new ImageIcon(image3);
        portada3.setIcon(ii3);
    }//GEN-LAST:event_previousMouseReleased

    /**
     * Function that moves all the images of the songs to the left.
     * 
     */
    private void nextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseReleased
        portada3.setIcon(portada2.getIcon());
        portada2.setIcon(portada1.getIcon());
        song = rand.nextInt(8);
        ImageIcon ii3 = new ImageIcon(getClass().getResource(canciones[song]));
        Image image3 = ii3.getImage().getScaledInstance(portada1.getWidth(), portada1.getHeight(), Image.SCALE_SMOOTH);
        ii3 = new ImageIcon(image3);
        portada1.setIcon(ii3);
    }//GEN-LAST:event_nextMouseReleased

    /**
     * Function that keeps all the favorite songs into favorites's vector.
     * 
     */
    private void favoritosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritosMouseReleased
        if(numFav < 4){
            favorites[numFav] = portada2.getIcon();
            JOptionPane.showMessageDialog(null, "Imagen añadida a favoritos", "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
            numFav++;
        }else{
            JOptionPane.showMessageDialog(null, "No puedes guardar más favoritos, borraremos el primero que añadiste", "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_favoritosMouseReleased

    /**
     * Function that set FavoriteMusic screen visible.
     * 
     */
    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        FavoriteMusic aux = new FavoriteMusic();
        aux.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseReleased


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Music().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel favoritos;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel next;
    private javax.swing.JLabel play;
    private javax.swing.JLabel portada1;
    private javax.swing.JLabel portada2;
    private javax.swing.JLabel portada3;
    private javax.swing.JLabel previous;
    // End of variables declaration//GEN-END:variables
}
