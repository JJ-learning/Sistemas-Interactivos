/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;



/**
 *
 * @author juanjo
 */
public class Persona {
    private String _name;
    private String _surname;
    private int _age;
    
    
    public Persona(String name, String surname, int age){
        _name = name;
        _surname = surname;
        _age = age;
    }
    
    // Gets functions
    public String getName(){
        return _name;
    }
    public String getSurName(){
        return _surname;
    }
    public int getAge(){
        return _age;
    }

    // Sets functions
    public void setName(String name){
        _name = name;
    }
    public void setSurName(String surname){
        _surname = surname;
    }
    public boolean setAge(int age){
        if(age <= 0){
            return false;
        }else{
            _age = age;
            return true;
        }
    }
   
}
