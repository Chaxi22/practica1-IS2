/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicauno;

import java.util.Date;

/**
 *
 * @author Chaxi
 */
public class PracticaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        
        Person p1;
        Date f;
        f = new Date(93,11,25);
        p1 = new Person("Chaxiraxi", "Cabrera", f);
        
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday());
        System.out.println(p1.getAge());
        System.out.println("Fin");
    }
    
}
