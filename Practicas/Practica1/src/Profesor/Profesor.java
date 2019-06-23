/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

import java.util.Scanner;

/**
 *
 * @author juanjo
 */
public class Profesor extends Persona {

    private String _university;
    private int _id_profesor;

    public static void main(String[] Args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:\n\t1.Por defecto.\n\t2.Introducir datos por consola.");
        int option = sc.nextInt();

        if (option == 1) { // Default variables
            Profesor profesor = new Profesor();
            System.out.println("El profesor " + profesor.getName() + " " + profesor.getSurName() + " con edad " + profesor.getAge() + " trabaja en la universidad " + profesor.getUniversity() + " y tiene un id " + profesor.getIDProfesor());
        } else { // Users variables
            // Persona variables
            System.out.println("Introduce el nombre del profesor: ");
            String name = sc.next();
            System.out.println("Introduce el apellido del profesor: ");
            String surname = sc.next();
            System.out.println("Introduce la edad del profesor: ");
            int age = sc.nextInt();
            Profesor profesor = new Profesor(name, surname, age);

            // Profesor variables
            System.out.println("Introduce la universidad: ");
            String university = sc.next();
            profesor.setUniversity(university);

            System.out.println("Introduce el id del profesor: ");
            int id_profesor = sc.nextInt();
            profesor.setIDProfesor(id_profesor);

            System.out.println("El profesor " + profesor.getName() + " " + profesor.getSurName() + " con edad " + profesor.getAge() + " trabaja en la universidad " + profesor.getUniversity() + " y tiene un id " + profesor.getIDProfesor());
        }

    }

    public Profesor(String name, String surname, int age) {
        super(name, surname, age);
        _university = "";
        _id_profesor = 0;
    }

    public Profesor() {
        super("Defaul_name", "Default_surname", 1);
        _university = "default_uni";
        _id_profesor = 0000;
    }

    // Gets functions
    public String getUniversity() {
        return _university;
    }

    public int getIDProfesor() {
        return _id_profesor;
    }

    // Sets functions
    public void setUniversity(String university) {
        _university = university;
    }

    public void setIDProfesor(int id_profesor) {
        _id_profesor = id_profesor;
    }

}
