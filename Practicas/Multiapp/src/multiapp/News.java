
package multiapp;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan José Méndez Torrero
 */
public class News extends javax.swing.JFrame {

    private String[] titles = new String[8];
    private String[] comments = new String[8];
    
    public static String[][] favorites = new String[3][2];
    public int favNumber = 0;
    int []cards = new int[4];

    public News() {
        initComponents();
        initializeNews();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Card1 = new javax.swing.JPanel();
        textCard = new javax.swing.JLabel();
        eyeIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TitleCard = new javax.swing.JTextArea();
        refreshIcon = new javax.swing.JLabel();
        Card2 = new javax.swing.JPanel();
        textCard1 = new javax.swing.JLabel();
        eyeIcon2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TitleCard1 = new javax.swing.JTextArea();
        Card3 = new javax.swing.JPanel();
        textCard2 = new javax.swing.JLabel();
        eyeIcon3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TitleCard2 = new javax.swing.JTextArea();

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

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ver Favoritas");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ver noticias");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Noticias");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Card1.setBackground(new java.awt.Color(233, 255, 255));
        Card1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 4, true));

        textCard.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        textCard.setText("jLabel1");

        eyeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        eyeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eyeIconMouseReleased(evt);
            }
        });

        TitleCard.setEditable(false);
        TitleCard.setBackground(new java.awt.Color(233, 255, 255));
        TitleCard.setColumns(20);
        TitleCard.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        TitleCard.setRows(5);
        TitleCard.setTabSize(0);
        TitleCard.setBorder(null);
        jScrollPane1.setViewportView(TitleCard);

        javax.swing.GroupLayout Card1Layout = new javax.swing.GroupLayout(Card1);
        Card1.setLayout(Card1Layout);
        Card1Layout.setHorizontalGroup(
            Card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Card1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eyeIcon)
                .addContainerGap())
        );
        Card1Layout.setVerticalGroup(
            Card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Card1Layout.createSequentialGroup()
                        .addComponent(eyeIcon)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        refreshIcon.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        refreshIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refreshIcon.setText("Refresh");
        refreshIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshIconMouseReleased(evt);
            }
        });

        Card2.setBackground(new java.awt.Color(233, 255, 255));
        Card2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 4, true));

        textCard1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        textCard1.setText("jLabel1");

        eyeIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        eyeIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eyeIcon2MouseReleased(evt);
            }
        });

        TitleCard1.setEditable(false);
        TitleCard1.setBackground(new java.awt.Color(233, 255, 255));
        TitleCard1.setColumns(20);
        TitleCard1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        TitleCard1.setRows(5);
        TitleCard1.setBorder(null);
        jScrollPane5.setViewportView(TitleCard1);

        javax.swing.GroupLayout Card2Layout = new javax.swing.GroupLayout(Card2);
        Card2.setLayout(Card2Layout);
        Card2Layout.setHorizontalGroup(
            Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Card2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eyeIcon2)
                .addContainerGap())
        );
        Card2Layout.setVerticalGroup(
            Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Card2Layout.createSequentialGroup()
                        .addComponent(eyeIcon2)
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Card3.setBackground(new java.awt.Color(233, 255, 255));
        Card3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 4, true));

        textCard2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        textCard2.setText("jLabel1");

        eyeIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        eyeIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eyeIcon3MouseReleased(evt);
            }
        });

        TitleCard2.setEditable(false);
        TitleCard2.setBackground(new java.awt.Color(233, 255, 255));
        TitleCard2.setColumns(20);
        TitleCard2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        TitleCard2.setRows(5);
        TitleCard2.setBorder(null);
        jScrollPane6.setViewportView(TitleCard2);

        javax.swing.GroupLayout Card3Layout = new javax.swing.GroupLayout(Card3);
        Card3.setLayout(Card3Layout);
        Card3Layout.setHorizontalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Card3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eyeIcon3)
                .addContainerGap())
        );
        Card3Layout.setVerticalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Card3Layout.createSequentialGroup()
                        .addComponent(eyeIcon3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62)
                        .addComponent(refreshIcon))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshIcon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
     * Function that initializes all the news with titles and comments.
     * 
     */
    private void initializeNews(){
        titles[0] = "Camelia, una española embarazada \n a la que Francia quiere expulsar por manifestarse\n con un escudo";
        titles[1] = "Posibles causas del accidente del avión \nen Moscú: Malos pilotos, fallo mecánico\n y mal tiempo";
        titles[2] = "Nyiragongo, el volcán que revive una ciudad\n o el que la condena";
        titles[3] = "'Vengadores:\n Endgame' supera en dos\n semanas a 'Titanic' y amenaza a 'Avatar'.";
        titles[4] = "El Congreso cuenta desde hoy con un\n retrato oficial de Felipe VI que \nha costado 88.000 euros";
        titles[5] = "Nadal, pendiente \nde su estómago antes de su debut\n en Madrid";
        titles[6] = "La falta de confianza le\n está pasando factura a Jorge\n Lorenzo";
        titles[7] = "Elecciones 2019: Ciudadanos\n no vetará pactos con el PSOE en \nalgunas comunidades";
        
        comments[0] = "Esta española de 34 años\n que reside desde 2002 en París,\n fue detenida durante las manifestaciones.";
        comments[1] = "Son las causas que el Comité\n de Investigaciones ruso baraja";
        comments[2] = "Es el más activo del mundo y\n mantiene en alerta a los mejores\n vulcanólogos del mundo";
        comments[3] = "La película de Marvel Studios ha\n recaudado 2.188 millones de dólares\n (1.955 millones de euros)";
        comments[4] = "La obra, de Hernán Cortés,\n preside la sala donde se reúne\n la Mesa de la Cámara";
        comments[5] = "El tenista balear,\n aquejado de un virus, ya canceló su \nsesión de entrenamiento el domingo";
        comments[6] = "La victoria de Marc Márquez \nen Jerez, tras su caída en la\n última carrera en Austin";
        comments[7] = "La formación 'naranja' podría pactar\n gobiernos con los socialistas.";
        Random rand = new Random();
        int j = 0;
        for(int i = 0; i<4; i++){
            cards[i] = rand.nextInt(8);
            j = i; 
        }
        
        TitleCard.setText(titles[cards[0]]);
        TitleCard1.setText(titles[cards[1]]);
        TitleCard2.setText(titles[cards[2]]);
        
        textCard.setText(comments[cards[0]]);
        textCard1.setText(comments[cards[1]]);
        textCard2.setText(comments[cards[2]]);
    }
    
    /**
     * Function that returns all the favorite songs.
     * 
     */
    public static String[][] getFavorites(){
        return favorites;
    }
    
    /**
     * Function that set fresh news into the screen.
     * 
     */
    private void refreshIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshIconMouseReleased
        initializeNews();
    }//GEN-LAST:event_refreshIconMouseReleased

    /**
     * Function that keep into favorites matrix the new with its title.
     * 
     */
    private void eyeIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeIconMouseReleased
        favorites[0][0] = TitleCard.getText();        
        favorites[0][1] = TitleCard.getText();
        JOptionPane.showMessageDialog(null, "Noticia añadida a favoritos", "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_eyeIconMouseReleased

    /**
     * Function that set FavoriteNews screen visible.
     * 
     */
    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        FavoriteNews aux = new FavoriteNews();
        aux.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseReleased

    /**
     * Function that keep into favorites matrix the new with its title.
     * 
     */
    private void eyeIcon2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeIcon2MouseReleased
        favorites[1][0] = TitleCard1.getText();        
        favorites[1][1] = TitleCard1.getText();
        JOptionPane.showMessageDialog(null, "Noticia añadida a favoritos", "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_eyeIcon2MouseReleased

    /**
     * Function that keep into favorites matrix the new with its title.
     * 
     */
    private void eyeIcon3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeIcon3MouseReleased
        favorites[2][0] = TitleCard2.getText();        
        favorites[2][1] = TitleCard2.getText(); 
        JOptionPane.showMessageDialog(null, "Noticia añadida a favoritos", "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_eyeIcon3MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        this.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseReleased


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new News().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Card1;
    private javax.swing.JPanel Card2;
    private javax.swing.JPanel Card3;
    private javax.swing.JTextArea TitleCard;
    private javax.swing.JTextArea TitleCard1;
    private javax.swing.JTextArea TitleCard2;
    private javax.swing.JLabel eyeIcon;
    private javax.swing.JLabel eyeIcon2;
    private javax.swing.JLabel eyeIcon3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel refreshIcon;
    private javax.swing.JLabel textCard;
    private javax.swing.JLabel textCard1;
    private javax.swing.JLabel textCard2;
    // End of variables declaration//GEN-END:variables
}
