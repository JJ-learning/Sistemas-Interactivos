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
public class Lamp {
    private String _ip;
    private String _name;
    private Boolean _state;
    private String _color;
    
    public Lamp(){
       this._ip = "";
        this._name = "Null_lamp";
        this._state = false;
        this._color = "default";
    }
    
    public Lamp(String ip, String name, Boolean state, String color){
        this._ip = ip;
        this._name = name;
        this._state = state;
        this._color = color;
        
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
    
    public void setColor(String color){
        this._color = color;
    }
    
    public String getColor(){
        return this._color;
    }
    
    
}
