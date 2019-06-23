/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myh;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author juanjo
 */
public class Blind {
    private String _ip;
    private String _name;
    private int _level;
    
    public Blind(){
       this._ip = "";
        this._name = "Null_lamp";
        this._level = 0;
    }
    
    public Blind(String ip, String name, int level){
        this._ip = ip;
        this._name = name;
        this._level = level;
        
        File fichero = new File("/src/devices/fichero");
    }
    
    public void setIP(String ip){
        this._ip = ip;
    }
    
    public String getIp(){
        return this._ip;
    }
    
    public void setName(String name){
        this._name = name;
    }
    
    public String getName(){
        return this._name;
    }
    
    public void setLevel(int level){
        this._level = level;
    }
    
    public int getLevel(){
        return this._level;
    }
    
    
}
