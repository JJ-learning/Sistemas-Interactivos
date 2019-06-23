/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myh;


import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author juanjo
 */
public class Map extends javax.swing.JFrame {
    
    void initializeBlind(String device){
        File f = new File("src/devices");
        int count =0;
        int linenum = 0;
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(name) && name.endsWith(".txt");
            }
        });
        
        String features[] = new String[4];
        try {
            FileReader fileReader = new FileReader(f+"/"+device+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }
            
            if(device == "Blind1"){
                if(features[2].equals("0")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/blindOff.png"));
                    Image image = ii.getImage().getScaledInstance(Blind1.getWidth(), Blind1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Blind1.setIcon(ii);
                }
                else{
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/blindOn.png"));
                    Image image = ii.getImage().getScaledInstance(Blind1.getWidth(), Blind1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Blind1.setIcon(ii);
                }
            }
            if(device == "Blind2"){
                if(features[2].equals("0")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/blindOff.png"));
                    Image image = ii.getImage().getScaledInstance(Blind2.getWidth(), Blind2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Blind2.setIcon(ii);
                }
                else{
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/blindOn.png"));
                    Image image = ii.getImage().getScaledInstance(Blind2.getWidth(), Blind2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Blind2.setIcon(ii);
                }
            }
            fileReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    void initializeAir(String device){
        File f = new File("src/devices");
        int count =0;
        int linenum = 0;
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(name) && name.endsWith(".txt");
            }
        });
        
        String features[] = new String[4];
        try {
            FileReader fileReader = new FileReader(f+"/"+device+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }
            
            if(device == "Air1"){
                if(features[2].equals("On")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/airOn.png"));
                    Image image = ii.getImage().getScaledInstance(Air1.getWidth(), Air1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Air1.setIcon(ii);
                }
                if(features[2].equals("Off")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/airOff.png"));
                    Image image = ii.getImage().getScaledInstance(Air1.getWidth(), Air1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Air1.setIcon(ii);
                }
            }
            if(device == "Air2"){
                if(features[2].equals("On")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/airOn.png"));
                    Image image = ii.getImage().getScaledInstance(Air2.getWidth(), Air2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Air2.setIcon(ii);
                }
                if(features[2].equals("Off")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/airOff.png"));
                    Image image = ii.getImage().getScaledInstance(Air2.getWidth(), Air2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Air2.setIcon(ii);
                }
            }
            fileReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    void initializeLock(String device){
        File f = new File("src/devices");
        int count =0;
        int linenum = 0;
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(name) && name.endsWith(".txt");
            }
        });
        
        String features[] = new String[4];
        try {
            FileReader fileReader = new FileReader(f+"/"+device+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }
            
            if(device == "Lock1"){
                if(features[2].equals("On")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/openLock.png"));
                    Image image = ii.getImage().getScaledInstance(Lock1.getWidth(), Lock1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lock1.setIcon(ii);
                }
                if(features[2].equals("Off")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/closeLock.png"));
                    Image image = ii.getImage().getScaledInstance(Lock1.getWidth(), Lock1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lock1.setIcon(ii);
                }
            }
            if(device == "Lock2"){
                if(features[2].equals("On")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/openLock.png"));
                    Image image = ii.getImage().getScaledInstance(Lock2.getWidth(), Lock2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lock2.setIcon(ii);
                }
                if(features[2].equals("Off")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/closeLock.png"));
                    Image image = ii.getImage().getScaledInstance(Lock2.getWidth(), Lock2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lock2.setIcon(ii);
                }
            }
            fileReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    void initializeLamp(String device){
        File f = new File("src/devices");
        int count =0;
        int linenum = 0;
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(name) && name.endsWith(".txt");
            }
        });
        
        String features[] = new String[4];
        try {
            FileReader fileReader = new FileReader(f+"/"+device+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }
            
            if(device == "Lamp1"){
                if(features[2].equals("On")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/LampOn.png"));
                    Image image = ii.getImage().getScaledInstance(Lamp1.getWidth(), Lamp1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lamp1.setIcon(ii);
                }
                if(features[2].equals("Off")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/lampOff.png"));
                    Image image = ii.getImage().getScaledInstance(Lamp1.getWidth(), Lamp1.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lamp1.setIcon(ii);
                }
            }
            if(device == "Lamp2"){
                if(features[2].equals("On")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/LampOn.png"));
                    Image image = ii.getImage().getScaledInstance(Lamp2.getWidth(), Lamp2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lamp2.setIcon(ii);
                }
                if(features[2].equals("Off")){
                    ImageIcon ii = new ImageIcon(getClass().getResource("/images/lampOff.png"));
                    Image image = ii.getImage().getScaledInstance(Lamp2.getWidth(), Lamp2.getHeight(), Image.SCALE_SMOOTH);
                    ii = new ImageIcon(image);
                    Lamp2.setIcon(ii);
                }
            }
            fileReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    Boolean checkFile(String file) throws IOException{
        File f = new File(file);
        if(f.exists() && !f.isDirectory()) { 
            return true;
        }else{
            return false;
        }
    }
    
    void initializeComponents() throws IOException{
        if(checkFile("src/devices/Lamp1.txt") == true){
            initializeLamp("Lamp1");
        }else{
            Lamp1.setVisible(false);
        }
        if(checkFile("src/devices/Lamp2.txt") == true){
            initializeLamp("Lamp2");
        }else{
            Lamp2.setVisible(false);
        }
        
        if(checkFile("src/devices/Lock1.txt") == true){
            initializeLock("Lock1");
        }else{
            Lock1.setVisible(false);
        }
        if(checkFile("src/devices/Lock2.txt") == true){
            initializeLock("Lock2");
        }else{
            Lock2.setVisible(false);
        }
        
        if(checkFile("src/devices/Air1.txt") == true){
            initializeAir("Air1");
        }else{
            Air1.setVisible(false);
        }
        if(checkFile("src/devices/Air2.txt") == true){
            initializeAir("Air2");
        }else{
            Air2.setVisible(false);
        }
        
        if(checkFile("src/devices/Blind1.txt") == true){
            initializeBlind("Blind1");
        }else{
            Blind1.setVisible(false);
        }
        if(checkFile("src/devices/Blind2.txt") == true){
            initializeBlind("Blind2");
        }else{
            Blind2.setVisible(false);
        }
    }
    /**
     * Creates new form Map
     */
    public Map() {
        initComponents();
        try {
            
            initializeComponents();
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        devicesButton = new javax.swing.JLabel();
        mapButton = new javax.swing.JLabel();
        helpButton = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Lamp1 = new javax.swing.JLabel();
        Lamp2 = new javax.swing.JLabel();
        Lock1 = new javax.swing.JLabel();
        Lock2 = new javax.swing.JLabel();
        Air1 = new javax.swing.JLabel();
        Air2 = new javax.swing.JLabel();
        Blind1 = new javax.swing.JLabel();
        Blind2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(839, 639));

        homeButton.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeButton.setText("Go home");
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeButtonMouseReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 222, 0));

        devicesButton.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        devicesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        devicesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devices.png"))); // NOI18N
        devicesButton.setText("     Devices");
        devicesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                devicesButtonMouseReleased(evt);
            }
        });

        mapButton.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        mapButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mapButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homemap.png"))); // NOI18N
        mapButton.setText("House map");
        mapButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mapButtonMouseReleased(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        helpButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        helpButton.setText("       Help");
        helpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                helpButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(devicesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mapButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(helpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(devicesButton)
                .addGap(18, 18, 18)
                .addComponent(mapButton)
                .addGap(18, 18, 18)
                .addComponent(helpButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("House map");

        jPanel3.setBackground(new java.awt.Color(255, 222, 0));
        jPanel3.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Map.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 0, 610, 425);

        Lamp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lampOff.png"))); // NOI18N
        Lamp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Lamp1MouseReleased(evt);
            }
        });
        jPanel3.add(Lamp1);
        Lamp1.setBounds(370, 110, 57, 60);

        Lamp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lampOff.png"))); // NOI18N
        Lamp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Lamp2MouseReleased(evt);
            }
        });
        jPanel3.add(Lamp2);
        Lamp2.setBounds(190, 170, 57, 70);

        Lock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeLock.png"))); // NOI18N
        Lock1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Lock1MouseReleased(evt);
            }
        });
        jPanel3.add(Lock1);
        Lock1.setBounds(300, 80, 43, 40);

        Lock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeLock.png"))); // NOI18N
        Lock2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Lock2MouseReleased(evt);
            }
        });
        jPanel3.add(Lock2);
        Lock2.setBounds(170, 296, 43, 40);

        Air1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/airOff.png"))); // NOI18N
        Air1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Air1MouseReleased(evt);
            }
        });
        jPanel3.add(Air1);
        Air1.setBounds(320, 280, 62, 40);

        Air2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/airOff.png"))); // NOI18N
        Air2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Air2MouseReleased(evt);
            }
        });
        jPanel3.add(Air2);
        Air2.setBounds(450, 190, 62, 30);

        Blind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blindOff.png"))); // NOI18N
        Blind1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Blind1MouseReleased(evt);
            }
        });
        jPanel3.add(Blind1);
        Blind1.setBounds(450, 50, 43, 40);

        Blind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blindOff.png"))); // NOI18N
        Blind2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Blind2MouseReleased(evt);
            }
        });
        jPanel3.add(Blind2);
        Blind2.setBounds(90, 130, 43, 50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(homeButton)
                .addGap(109, 109, 109))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseReleased
        // TODO add your handling code here:
        Index screen = new Index();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonMouseReleased

    private void devicesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devicesButtonMouseReleased
        try {
            // TODO add your handling code here:
            Devices screen = new Devices();
            screen.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_devicesButtonMouseReleased

    private void helpButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseReleased
        // TODO add your handling code here:
        Help screen = new Help();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_helpButtonMouseReleased
    
    void changeStateFile(String aux, String state){
        try{
            Path path = Paths.get(aux);
            Stream <String> lines = Files.lines(path);
            List <String> replaced = null;
            if(state.equals("On")){
                replaced = lines.map(line -> line.replaceAll("On", "Off")).collect(Collectors.toList());
            }
            if(state.equals("Off")){
                replaced = lines.map(line -> line.replaceAll("Off", "On")).collect(Collectors.toList());
            }
            Files.write(path, replaced);
            lines.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    Lamp readFile(String path) throws FileNotFoundException, IOException{
        File f = new File(path);
        String[] features = new String[20];
        int i=0;
        Lamp aux = new Lamp();
        
        Scanner scanner = new Scanner(f);  
        while (scanner.hasNextLine()) {  
           String line = scanner.nextLine();
           features[i] = line;
           i++;
        }
        
        aux.setName(features[0]);
        aux.setIP(features[1]);
        if(features[2].equals("On")){
            aux.setState(true);
        }
        if(features[2].equals("Off")){
            aux.setState(false);
        }
        aux.setColor(features[3]);

        return aux;
    }
    private void Lamp1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lamp1MouseReleased
        Boolean aux2 = null;
        String path = "src/devices/Lamp1.txt";
        try {
            // TODO add your handling code here:
            Lamp aux = readFile(path);
            aux2 = aux.getState();
            
            if(aux.getState() == true){
                changeStateFile(path, "On");
            }
            if(aux.getState() == false){
                changeStateFile(path, "Off");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Lamp1MouseReleased

    private void mapButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapButtonMouseReleased
        // TODO add your handling code here:
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mapButtonMouseReleased

    private void Lamp2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lamp2MouseReleased
        // TODO add your handling code here:
        Boolean aux2 = null;
        String path = "src/devices/Lamp2.txt";
        try {
            // TODO add your handling code here:
            Lamp aux = readFile(path);
            aux2 = aux.getState();
            
            if(aux.getState() == true){
                changeStateFile(path, "On");
            }
            if(aux.getState() == false){
                changeStateFile(path, "Off");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Lamp2MouseReleased
    Lock readFile2(String path) throws FileNotFoundException, IOException{
        File f = new File(path);
        String[] features = new String[20];
        int i=0;
        Lock aux = new Lock();
        
        Scanner scanner = new Scanner(f);  
        while (scanner.hasNextLine()) {  
           String line = scanner.nextLine();
           features[i] = line;
           i++;
        }
        
        aux.setName(features[0]);
        aux.setIP(features[1]);
        if(features[2].equals("On")){
            aux.setState(true);
        }
        if(features[2].equals("Off")){
            aux.setState(false);
        }

        return aux;
    }
    private void Lock1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock1MouseReleased
        // TODO add your handling code here:
        Boolean aux2 = null;
        String path = "src/devices/Lock1.txt";
        try {
            // TODO add your handling code here:
            Lock aux = readFile2(path);
            aux2 = aux.getState();
            
            if(aux.getState() == true){
                changeStateFile(path, "On");
            }
            if(aux.getState() == false){
                changeStateFile(path, "Off");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Lock1MouseReleased
    
    private void Lock2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lock2MouseReleased
        // TODO add your handling code here:
        Boolean aux2 = null;
        String path = "src/devices/Lock2.txt";
        try {
            // TODO add your handling code here:
            Lock aux = readFile2(path);
            aux2 = aux.getState();
            
            if(aux.getState() == true){
                changeStateFile(path, "On");
            }
            if(aux.getState() == false){
                changeStateFile(path, "Off");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Lock2MouseReleased
     Air readFile3(String path) throws FileNotFoundException, IOException{
        File f = new File(path);
        String[] features = new String[20];
        int i=0;
        Air aux = new Air();
        
        Scanner scanner = new Scanner(f);  
        while (scanner.hasNextLine()) {  
           String line = scanner.nextLine();
           features[i] = line;
           i++;
        }
        
        aux.setName(features[0]);
        aux.setIP(features[1]);
        if(features[2].equals("On")){
            aux.setState(true);
        }
        if(features[2].equals("Off")){
            aux.setState(false);
        }

        return aux;
    }
    private void Air1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Air1MouseReleased
        // TODO add your handling code here:
        Boolean aux2 = null;
        String path = "src/devices/Air1.txt";
        try {
            // TODO add your handling code here:
            Air aux = readFile3(path);
            aux2 = aux.getState();
            
            if(aux.getState() == true){
                changeStateFile(path, "On");
            }
            if(aux.getState() == false){
                changeStateFile(path, "Off");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Air1MouseReleased

    private void Air2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Air2MouseReleased
        // TODO add your handling code here:
        Boolean aux2 = null;
        String path = "src/devices/Air2.txt";
        try {
            // TODO add your handling code here:
            Air aux = readFile3(path);
            aux2 = aux.getState();
            
            if(aux.getState() == true){
                changeStateFile(path, "On");
            }
            if(aux.getState() == false){
                changeStateFile(path, "Off");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Air2MouseReleased

    Blind readFile4(String path) throws FileNotFoundException, IOException{
        File f = new File(path);
        String[] features = new String[20];
        int i=0;
        Blind aux = new Blind();
        
        Scanner scanner = new Scanner(f);  
        while (scanner.hasNextLine()) {  
           String line = scanner.nextLine();
           features[i] = line;
           i++;
        }
        
        aux.setName(features[0]);
        aux.setIP(features[1]);
        if(features[2].equals("0")){
            aux.setLevel(0);
        }else{
            aux.setLevel(10);
        }

        return aux;
    }
    
    void changeStateFile2(String aux, String state_old, String stateNew){
        try{
            Path path = Paths.get(aux);
            Stream <String> lines = Files.lines(path);
            List <String> replaced = null;
           
            replaced = lines.map(line -> line.replaceAll(state_old, stateNew)).collect(Collectors.toList());
            
            
            Files.write(path, replaced);
            lines.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void Blind1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blind1MouseReleased
        // TODO add your handling code here:
        int aux2 = 0;
        String path = "src/devices/Blind1.txt";
        try {
            // TODO add your handling code here:
            Blind aux = readFile4(path);
            aux2 = aux.getLevel();
            
            if(aux.getLevel() == 0){
                changeStateFile2(path, "0", "10");
            }
            if(aux.getLevel() > 0){
                changeStateFile2(path, "10", "0");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Blind1MouseReleased

    private void Blind2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blind2MouseReleased
        // TODO add your handling code here:
        int aux2 = 0;
        String path = "src/devices/Blind2.txt";
        try {
            // TODO add your handling code here:
            Blind aux = readFile4(path);
            aux2 = aux.getLevel();
            
            if(aux.getLevel() == 0){
                changeStateFile2(path, "0", "10");
            }
            if(aux.getLevel() > 0){
                changeStateFile2(path, "10", "0");
            }
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Blind2MouseReleased

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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Air1;
    private javax.swing.JLabel Air2;
    private javax.swing.JLabel Blind1;
    private javax.swing.JLabel Blind2;
    private javax.swing.JLabel Lamp1;
    private javax.swing.JLabel Lamp2;
    private javax.swing.JLabel Lock1;
    private javax.swing.JLabel Lock2;
    private javax.swing.JLabel devicesButton;
    private javax.swing.JLabel helpButton;
    private javax.swing.JLabel homeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mapButton;
    // End of variables declaration//GEN-END:variables
}
