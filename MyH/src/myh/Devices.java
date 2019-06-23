/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myh;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author juanjo
 */
public class Devices extends javax.swing.JFrame {
    
    private int old_temperature1;
    private int old_temperature2;
    
    private int old_level1;
    private int old_level2;
    /**
     * Creates new form Devices
     */
    public Devices() throws IOException {
        this.old_temperature1 = 0;
        this.old_temperature2 = 0;
        initComponents();
        initializeDevices();
    }
    
    void fileRead1(String[] features){
        nameLamp1.setText(features[0]);
        stateLamp1.setText(features[2]);
    }
    
    void fileRead2(String[] features){
        nameLamp2.setText(features[0]);
        stateLamp2.setText(features[2]);
    }
    
    void fileRead3(String[] features){
        nameLock1.setText(features[0]);
        stateLock1.setText(features[2]);
    }
    
    void fileRead4(String[] features){
        nameLock2.setText(features[0]);
        stateLock2.setText(features[2]);
    }
    
    void fileRead5(String[] features){
        nameAir1.setText(features[0]);
        stateAir1.setText(features[2]);
        Air1TextField.setText(features[3]);
        old_temperature1 = Integer.parseInt(Air1TextField.getText());
    }
    
    void fileRead6(String[] features){
        nameAir2.setText(features[0]);
        stateAir2.setText(features[2]);
        Air2TextField.setText(features[3]);
        old_temperature2 = Integer.parseInt(Air2TextField.getText());
    }
    
    void fileRead7(String[] features){
        nameBlind1.setText(features[0]);
        levelBlind1.setText(features[2]);
        old_level1 = Integer.parseInt(levelBlind1.getText());
    }
    
    void fileRead8(String[] features){
        nameBlind2.setText(features[0]);
        levelBlind2.setText(features[2]);
        old_level2 = Integer.parseInt(levelBlind2.getText());
    }
    
    
    void initializeLamp(String name){
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
            FileReader fileReader = new FileReader(f+"/"+name+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }
            if(name == "Lamp1"){
                fileRead1(features);
            }else if(name == "Lamp2"){
                fileRead2(features);
            }
            

            fileReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    void initializeLock(String name){
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
            FileReader fileReader = new FileReader(f+"/"+name+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }

            if(name == "Lock1"){
                fileRead3(features);
            }else if(name == "Lock2"){
                fileRead4(features);
            }

            fileReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    void initializeAir(String name){
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
            FileReader fileReader = new FileReader(f+"/"+name+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }

            if(name == "Air1"){
                fileRead5(features);
            }else if(name == "Air2"){
                fileRead6(features);
            }

            fileReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    void initializeBlind(String name){
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
            FileReader fileReader = new FileReader(f+"/"+name+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null && linenum < 4) {
                    stringBuffer.append(line);
                    features[linenum] = line;
                    stringBuffer.append("\n");
                    linenum++;
            }

            if(name == "Blind1"){
                fileRead7(features);
            }else if(name == "Blind2"){
                fileRead8(features);
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
    
    void initializeDevices() throws IOException{
        if(checkFile("src/devices/Lamp1.txt") == true){
            initializeLamp("Lamp1");
        }else{
            stateLamp1.setVisible(false);
            editLamp1.setVisible(false);
        }
        
        if(checkFile("src/devices/Lamp2.txt") == true){
            initializeLamp("Lamp2");
        }else{
            stateLamp2.setVisible(false);
            editLamp2.setVisible(false);
        }
        
        if(checkFile("src/devices/Lock1.txt") == true){
            initializeLock("Lock1");
        }else{
            stateLock1.setVisible(false);
            editLock1.setVisible(false);
        }
        
        if(checkFile("src/devices/Lock2.txt") == true){
            initializeLock("Lock2");
        }else{
            stateLock2.setVisible(false);
            editLock2.setVisible(false);
        }
        
        if(checkFile("src/devices/Air1.txt") == true){
            initializeAir("Air1");
        }else{
            stateAir1.setVisible(false);
            editAir1.setVisible(false);
            Air1TextField.setVisible(false);
        }
        
        if(checkFile("src/devices/Air2.txt") == true){
            initializeAir("Air2");
        }else{
            stateAir2.setVisible(false);
            editAir2.setVisible(false);
            Air2TextField.setVisible(false);
        }
        
        if(checkFile("src/devices/Blind1.txt") == true){
            initializeBlind("Blind1");
        }else{
            levelBlind1.setVisible(false);
            editBlind1.setVisible(false);
        }
        
        if(checkFile("src/devices/Blind2.txt") == true){
            initializeBlind("Blind2");
        }else{
            levelBlind2.setVisible(false);
            editBlind2.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        devicesButton = new javax.swing.JLabel();
        mapButton = new javax.swing.JLabel();
        helpButton = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lock1Gap = new javax.swing.JPanel();
        editLock1 = new javax.swing.JLabel();
        stateLock1 = new javax.swing.JToggleButton();
        nameLock1 = new javax.swing.JLabel();
        Lamp1Gap = new javax.swing.JPanel();
        nameLamp1 = new javax.swing.JLabel();
        stateLamp1 = new javax.swing.JToggleButton();
        editLamp1 = new javax.swing.JLabel();
        Lamp2Gap = new javax.swing.JPanel();
        stateLamp2 = new javax.swing.JToggleButton();
        nameLamp2 = new javax.swing.JLabel();
        editLamp2 = new javax.swing.JLabel();
        Air2Gap = new javax.swing.JPanel();
        editAir2 = new javax.swing.JLabel();
        stateAir2 = new javax.swing.JToggleButton();
        nameAir2 = new javax.swing.JLabel();
        Air2TextField = new javax.swing.JTextField();
        LockGap2 = new javax.swing.JPanel();
        editLock2 = new javax.swing.JLabel();
        stateLock2 = new javax.swing.JToggleButton();
        nameLock2 = new javax.swing.JLabel();
        Blind1Gap = new javax.swing.JPanel();
        editBlind1 = new javax.swing.JLabel();
        nameBlind1 = new javax.swing.JLabel();
        levelBlind1 = new javax.swing.JTextField();
        Air1Gap = new javax.swing.JPanel();
        editAir1 = new javax.swing.JLabel();
        stateAir1 = new javax.swing.JToggleButton();
        nameAir1 = new javax.swing.JLabel();
        Air1TextField = new javax.swing.JTextField();
        Blind2Gap = new javax.swing.JPanel();
        editBlind2 = new javax.swing.JLabel();
        nameBlind2 = new javax.swing.JLabel();
        levelBlind2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deleteLamp1 = new javax.swing.JLabel();
        deleteLamp2 = new javax.swing.JLabel();
        deleteLock1 = new javax.swing.JLabel();
        deleteLock2 = new javax.swing.JLabel();
        deleteAir1 = new javax.swing.JLabel();
        deleteAir2 = new javax.swing.JLabel();
        deleteBlind1 = new javax.swing.JLabel();
        deleteBlind2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/devices.png"))); // NOI18N
        jLabel1.setText("     Devices");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homemap.png"))); // NOI18N
        jLabel2.setText("House map");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        jLabel3.setText("       Help");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jPanel3.setBackground(new java.awt.Color(255, 222, 0));

        devicesButton.setBackground(java.awt.Color.orange);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(devicesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mapButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(helpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
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
        jLabel4.setText("Devices");

        Lock1Gap.setBackground(new java.awt.Color(255, 222, 0));
        Lock1Gap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        editLock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editLock1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLock1MouseReleased(evt);
            }
        });

        stateLock1.setText("Off");
        stateLock1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateLock1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout Lock1GapLayout = new javax.swing.GroupLayout(Lock1Gap);
        Lock1Gap.setLayout(Lock1GapLayout);
        Lock1GapLayout.setHorizontalGroup(
            Lock1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lock1GapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLock1)
                .addGap(18, 18, 18)
                .addComponent(stateLock1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editLock1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Lock1GapLayout.setVerticalGroup(
            Lock1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lock1GapLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Lock1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editLock1)
                    .addComponent(stateLock1)
                    .addComponent(nameLock1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lamp1Gap.setBackground(new java.awt.Color(255, 222, 0));
        Lamp1Gap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        stateLamp1.setText("Off");
        stateLamp1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateLamp1StateChanged(evt);
            }
        });

        editLamp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editLamp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLamp1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Lamp1GapLayout = new javax.swing.GroupLayout(Lamp1Gap);
        Lamp1Gap.setLayout(Lamp1GapLayout);
        Lamp1GapLayout.setHorizontalGroup(
            Lamp1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lamp1GapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLamp1)
                .addGap(18, 18, 18)
                .addComponent(stateLamp1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editLamp1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Lamp1GapLayout.setVerticalGroup(
            Lamp1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lamp1GapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Lamp1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editLamp1)
                    .addGroup(Lamp1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(stateLamp1)
                        .addComponent(nameLamp1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lamp2Gap.setBackground(new java.awt.Color(255, 222, 0));
        Lamp2Gap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        stateLamp2.setText("Off");
        stateLamp2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateLamp2StateChanged(evt);
            }
        });

        editLamp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editLamp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLamp2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout Lamp2GapLayout = new javax.swing.GroupLayout(Lamp2Gap);
        Lamp2Gap.setLayout(Lamp2GapLayout);
        Lamp2GapLayout.setHorizontalGroup(
            Lamp2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Lamp2GapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLamp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stateLamp2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editLamp2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Lamp2GapLayout.setVerticalGroup(
            Lamp2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lamp2GapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Lamp2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editLamp2)
                    .addGroup(Lamp2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stateLamp2)
                        .addComponent(nameLamp2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Air2Gap.setBackground(new java.awt.Color(255, 222, 0));
        Air2Gap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        editAir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editAir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editAir2MouseReleased(evt);
            }
        });

        stateAir2.setText("Off");
        stateAir2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateAir2StateChanged(evt);
            }
        });

        Air2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Air2TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Air2GapLayout = new javax.swing.GroupLayout(Air2Gap);
        Air2Gap.setLayout(Air2GapLayout);
        Air2GapLayout.setHorizontalGroup(
            Air2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Air2GapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameAir2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateAir2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Air2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editAir2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Air2GapLayout.setVerticalGroup(
            Air2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Air2GapLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Air2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editAir2)
                    .addGroup(Air2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stateAir2)
                        .addComponent(Air2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameAir2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LockGap2.setBackground(new java.awt.Color(255, 222, 0));
        LockGap2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        editLock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editLock2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLock2MouseReleased(evt);
            }
        });

        stateLock2.setText("Off");
        stateLock2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateLock2StateChanged(evt);
            }
        });

        javax.swing.GroupLayout LockGap2Layout = new javax.swing.GroupLayout(LockGap2);
        LockGap2.setLayout(LockGap2Layout);
        LockGap2Layout.setHorizontalGroup(
            LockGap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LockGap2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLock2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stateLock2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editLock2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LockGap2Layout.setVerticalGroup(
            LockGap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LockGap2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LockGap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editLock2)
                    .addGroup(LockGap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLock2)
                        .addComponent(stateLock2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Blind1Gap.setBackground(new java.awt.Color(255, 222, 0));
        Blind1Gap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        editBlind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editBlind1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editBlind1MouseReleased(evt);
            }
        });

        levelBlind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelBlind1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Blind1GapLayout = new javax.swing.GroupLayout(Blind1Gap);
        Blind1Gap.setLayout(Blind1GapLayout);
        Blind1GapLayout.setHorizontalGroup(
            Blind1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Blind1GapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameBlind1)
                .addGap(18, 18, 18)
                .addComponent(levelBlind1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBlind1)
                .addGap(124, 124, 124))
        );
        Blind1GapLayout.setVerticalGroup(
            Blind1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Blind1GapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Blind1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Blind1GapLayout.createSequentialGroup()
                        .addComponent(levelBlind1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Blind1GapLayout.createSequentialGroup()
                        .addComponent(editBlind1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Blind1GapLayout.createSequentialGroup()
                        .addComponent(nameBlind1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
        );

        Air1Gap.setBackground(new java.awt.Color(255, 222, 0));
        Air1Gap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        editAir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editAir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editAir1MouseReleased(evt);
            }
        });

        stateAir1.setText("Off");
        stateAir1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateAir1StateChanged(evt);
            }
        });

        Air1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Air1TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Air1GapLayout = new javax.swing.GroupLayout(Air1Gap);
        Air1Gap.setLayout(Air1GapLayout);
        Air1GapLayout.setHorizontalGroup(
            Air1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Air1GapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameAir1)
                .addGap(18, 18, 18)
                .addComponent(stateAir1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Air1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editAir1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Air1GapLayout.setVerticalGroup(
            Air1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Air1GapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Air1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editAir1)
                    .addGroup(Air1GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameAir1)
                        .addComponent(Air1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stateAir1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Blind2Gap.setBackground(new java.awt.Color(255, 222, 0));
        Blind2Gap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        editBlind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editBlind2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editBlind2MouseReleased(evt);
            }
        });

        levelBlind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelBlind2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Blind2GapLayout = new javax.swing.GroupLayout(Blind2Gap);
        Blind2Gap.setLayout(Blind2GapLayout);
        Blind2GapLayout.setHorizontalGroup(
            Blind2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Blind2GapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameBlind2)
                .addGap(18, 18, 18)
                .addComponent(levelBlind2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBlind2)
                .addGap(124, 124, 124))
        );
        Blind2GapLayout.setVerticalGroup(
            Blind2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Blind2GapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Blind2GapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Blind2GapLayout.createSequentialGroup()
                        .addComponent(levelBlind2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Blind2GapLayout.createSequentialGroup()
                        .addComponent(editBlind2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Blind2GapLayout.createSequentialGroup()
                        .addComponent(nameBlind2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
        );

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel5.setText("<html>New Lock</html>");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel6.setText("<html>New Lamp</html>");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel7.setText("<html>New Air</html>");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel8.setText("<html>New Blind</html>");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });

        deleteLamp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteLamp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteLamp1MouseReleased(evt);
            }
        });

        deleteLamp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteLamp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteLamp2MouseReleased(evt);
            }
        });

        deleteLock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteLock1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteLock1MouseReleased(evt);
            }
        });

        deleteLock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteLock2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteLock2MouseReleased(evt);
            }
        });

        deleteAir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteAir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteAir1MouseReleased(evt);
            }
        });

        deleteAir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteAir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteAir2MouseReleased(evt);
            }
        });

        deleteBlind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteBlind1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteBlind1MouseReleased(evt);
            }
        });

        deleteBlind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteBlind2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteBlind2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Blind1Gap, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Air1Gap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Lock1Gap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Lamp1Gap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteLamp1)
                                    .addComponent(deleteLock1)
                                    .addComponent(deleteAir1)
                                    .addComponent(deleteBlind1))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LockGap2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Blind2Gap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Air2Gap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lamp2Gap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteLamp2)
                                    .addComponent(deleteLock2)
                                    .addComponent(deleteAir2)
                                    .addComponent(deleteBlind2))
                                .addGap(0, 79, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lamp2Gap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lamp1Gap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(deleteLamp1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(deleteLamp2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lock1Gap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LockGap2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(deleteLock2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(deleteLock1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(Air1Gap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Air2Gap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(deleteAir2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8)
                                        .addComponent(Blind2Gap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Blind1Gap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(deleteBlind2)))
                        .addGap(159, 159, 159)
                        .addComponent(homeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(deleteAir1)
                        .addGap(39, 39, 39)
                        .addComponent(deleteBlind1)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        // TODO add your handling code here:
        NewBlind screen = new NewBlind();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        // TODO add your handling code here:
        NewAir screen = new NewAir();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        // TODO add your handling code here:
        NewLamp screen = new NewLamp();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        // TODO add your handling code here:
        NewLock screen= new NewLock();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseReleased

    private void levelBlind2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelBlind2ActionPerformed
        // TODO add your handling code here:
        changeValueFile("src/devices/Blind2.txt", levelBlind2.getText(), Integer.toString(old_level2));
    }//GEN-LAST:event_levelBlind2ActionPerformed

    private void Air1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Air1TextFieldActionPerformed
        // TODO add your handling code here:
        changeValueFile("src/devices/Air1.txt", Air1TextField.getText(), Integer.toString(old_temperature1));
    }//GEN-LAST:event_Air1TextFieldActionPerformed

    private void stateAir1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateAir1StateChanged
        // TODO add your handling code here:
        if(stateAir1.isSelected()){
            stateAir1.setText("On");
            changeStateFile("src/devices/Air1.txt", "Off");
        }else{
            stateAir1.setText("Off");
            changeStateFile("src/devices/Air1.txt", "On");
        }
    }//GEN-LAST:event_stateAir1StateChanged

    private void editAir1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAir1MouseReleased
        // TODO add your handling code here:
        editAir1 screen = new editAir1();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editAir1MouseReleased

    private void levelBlind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelBlind1ActionPerformed
        // TODO add your handling code here:
        changeValueFile("src/devices/Blind1.txt", levelBlind1.getText(), Integer.toString(old_level1));
    }//GEN-LAST:event_levelBlind1ActionPerformed

    private void stateLock2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateLock2StateChanged
        // TODO add your handling code here:
        if(stateLock2.isSelected()){
            stateLock2.setText("On");
            changeStateFile("src/devices/Lock2.txt", "Off");
        }else{
            stateLock2.setText("Off");
            changeStateFile("src/devices/Lock2.txt", "On");
        }
    }//GEN-LAST:event_stateLock2StateChanged

    private void editLock2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLock2MouseReleased
        // TODO add your handling code here:
        editLock2 screen = new editLock2();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editLock2MouseReleased

    private void Air2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Air2TextFieldActionPerformed
        // TODO add your handling code here:
        changeValueFile("src/devices/Air2.txt", Air2TextField.getText(), Integer.toString(old_temperature2));
    }//GEN-LAST:event_Air2TextFieldActionPerformed

    private void stateAir2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateAir2StateChanged
        // TODO add your handling code here:
        if(stateAir2.isSelected()){
            stateAir2.setText("On");
            changeStateFile("src/devices/Air2.txt", "Off");
        }else{
            stateAir2.setText("Off");
            changeStateFile("src/devices/Air2.txt", "On");
        }
    }//GEN-LAST:event_stateAir2StateChanged

    private void editAir2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAir2MouseReleased
        // TODO add your handling code here:
        editAir2 screen = new editAir2();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editAir2MouseReleased

    private void editLamp2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLamp2MouseReleased
        try {
            // TODO add your handling code here:
            editLamp2 screen = new editLamp2();
            screen.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editLamp2MouseReleased

    private void stateLamp2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateLamp2StateChanged
        // TODO add your handling code here:
        if(stateLamp2.isSelected()){
            stateLamp2.setText("On");
            changeStateFile("src/devices/Lamp2.txt", "Off");
        }else{
            stateLamp2.setText("Off");
            changeStateFile("src/devices/Lamp2.txt", "On");
        }
    }//GEN-LAST:event_stateLamp2StateChanged

    private void editLamp1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLamp1MouseReleased
        // TODO add your handling code here:
        editLamp1 screen = new editLamp1();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editLamp1MouseReleased

    private void stateLamp1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateLamp1StateChanged
        // TODO add your handling code here:
        if(stateLamp1.isSelected()){
            stateLamp1.setText("On");
            changeStateFile("src/devices/Lamp1.txt", "Off");
        }else{
            stateLamp1.setText("Off");
            changeStateFile("src/devices/Lamp1.txt", "On");
        }
    }//GEN-LAST:event_stateLamp1StateChanged

    private void stateLock1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateLock1StateChanged
        // TODO add your handling code here:
        if(stateLock1.isSelected()){
            stateLock1.setText("On");
            changeStateFile("src/devices/Lock1.txt", "Off");
        }else{
            stateLock1.setText("Off");
            changeStateFile("src/devices/Lock1.txt", "On");
        }
    }//GEN-LAST:event_stateLock1StateChanged

    private void editLock1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLock1MouseReleased
        // TODO add your handling code here:
        editLock1 screen = new editLock1();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editLock1MouseReleased

    private void helpButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseReleased
        // TODO add your handling code here:
        Help screen = new Help();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_helpButtonMouseReleased

    private void devicesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devicesButtonMouseReleased
        try {
            // TODO add your handling code here:
            Devices screen = new Devices();
            screen.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_devicesButtonMouseReleased

    private void homeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseReleased
        // TODO add your handling code here:
        Index screen = new Index();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonMouseReleased
    
    void deleteFile(String path, String device){
        try {
            File file = new File(path);
            Boolean exists = checkFile(path);
            if(exists == true){
                if(file.delete()){
                    try {
                        JOptionPane.showMessageDialog(null, device +" successfully deleted. ", "Delete", JOptionPane.INFORMATION_MESSAGE);
                        Devices screen = new Devices();
                        screen.setVisible(true);
                        this.setVisible(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Device does not exists. ", "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
                
        } catch (IOException ex) {
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void deleteLamp1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLamp1MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Lamp1.txt", "Lamp1");
    }//GEN-LAST:event_deleteLamp1MouseReleased

    private void deleteLamp2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLamp2MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Lamp2.txt", "Lamp2");
    }//GEN-LAST:event_deleteLamp2MouseReleased

    private void deleteLock1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLock1MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Lock1.txt", "Lock1");
    }//GEN-LAST:event_deleteLock1MouseReleased

    private void deleteLock2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLock2MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Lock2.txt", "Lock2");
    }//GEN-LAST:event_deleteLock2MouseReleased

    private void deleteAir1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAir1MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Air1.txt", "Air1");
    }//GEN-LAST:event_deleteAir1MouseReleased

    private void deleteAir2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAir2MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Air2.txt", "Air2");
    }//GEN-LAST:event_deleteAir2MouseReleased

    private void deleteBlind1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBlind1MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Blind1.txt", "Blind1");
    }//GEN-LAST:event_deleteBlind1MouseReleased

    private void deleteBlind2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBlind2MouseReleased
        // TODO add your handling code here:
        deleteFile("src/devices/Blind2.txt", "Blind1");
    }//GEN-LAST:event_deleteBlind2MouseReleased

    private void editBlind1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBlind1MouseReleased
        // TODO add your handling code here:
        editBlind1 screen = new editBlind1();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editBlind1MouseReleased

    private void editBlind2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBlind2MouseReleased
        // TODO add your handling code here:
        editBlind2 screen = new editBlind2();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editBlind2MouseReleased

    private void mapButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapButtonMouseReleased
        // TODO add your handling code here:
        Map screen = new Map();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mapButtonMouseReleased

    void changeStateFile(String aux, String state){
        try{
            Path path = Paths.get(aux);
            Stream <String> lines = Files.lines(path);
            List <String> replaced = null;
            if(state == "On"){
                replaced = lines.map(line -> line.replaceAll("On", "Off")).collect(Collectors.toList());
            }else{
                replaced = lines.map(line -> line.replaceAll("Off", "On")).collect(Collectors.toList());
            }
            Files.write(path, replaced);
            lines.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
        
    void changeValueFile(String aux, String new_value, String old_value){
        try{
            Path path = Paths.get(aux);
            Stream <String> lines = Files.lines(path);
            List <String> replaced = null;
            replaced = lines.map(line -> line.replaceAll(old_value, new_value)).collect(Collectors.toList());
            Files.write(path, replaced);
            lines.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Devices().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Air1Gap;
    private javax.swing.JTextField Air1TextField;
    private javax.swing.JPanel Air2Gap;
    private javax.swing.JTextField Air2TextField;
    private javax.swing.JPanel Blind1Gap;
    private javax.swing.JPanel Blind2Gap;
    private javax.swing.JPanel Lamp1Gap;
    private javax.swing.JPanel Lamp2Gap;
    private javax.swing.JPanel Lock1Gap;
    private javax.swing.JPanel LockGap2;
    private javax.swing.JLabel deleteAir1;
    private javax.swing.JLabel deleteAir2;
    private javax.swing.JLabel deleteBlind1;
    private javax.swing.JLabel deleteBlind2;
    private javax.swing.JLabel deleteLamp1;
    private javax.swing.JLabel deleteLamp2;
    private javax.swing.JLabel deleteLock1;
    private javax.swing.JLabel deleteLock2;
    private javax.swing.JLabel devicesButton;
    private javax.swing.JLabel editAir1;
    private javax.swing.JLabel editAir2;
    private javax.swing.JLabel editBlind1;
    private javax.swing.JLabel editBlind2;
    private javax.swing.JLabel editLamp1;
    private javax.swing.JLabel editLamp2;
    private javax.swing.JLabel editLock1;
    private javax.swing.JLabel editLock2;
    private javax.swing.JLabel helpButton;
    private javax.swing.JLabel homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField levelBlind1;
    private javax.swing.JTextField levelBlind2;
    private javax.swing.JLabel mapButton;
    private javax.swing.JLabel nameAir1;
    private javax.swing.JLabel nameAir2;
    private javax.swing.JLabel nameBlind1;
    private javax.swing.JLabel nameBlind2;
    private javax.swing.JLabel nameLamp1;
    private javax.swing.JLabel nameLamp2;
    private javax.swing.JLabel nameLock1;
    private javax.swing.JLabel nameLock2;
    private javax.swing.JToggleButton stateAir1;
    private javax.swing.JToggleButton stateAir2;
    private javax.swing.JToggleButton stateLamp1;
    private javax.swing.JToggleButton stateLamp2;
    private javax.swing.JToggleButton stateLock1;
    private javax.swing.JToggleButton stateLock2;
    // End of variables declaration//GEN-END:variables
}
