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
public class Air {
    private String _ip;
    private String _name;
    private Boolean _state;
    private int _temperature;
    
    public Air(){
       this._ip = "";
        this._name = "Null_lamp";
        this._state = false;
        this._temperature = 20;
    }
    
    public Air(String ip, String name, Boolean state, int _temperature){
        this._ip = ip;
        this._name = name;
        this._state = state;
        this._temperature = _temperature;
        
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
    
    public void setState(Boolean state){
        this._state = state;
    }
    
    public Boolean getState(){
        return this._state;
    }
    
    public void setTemperature(int temperature){
        this._temperature = temperature;
    }
    
    public int getTemperature(){
        return this._temperature;
    }
    
    
}
