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
public class Person {
    private final String name;
    private final String surname;
    private final Date birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public String getFullName(){
        return name+" "+surname;
    }
    
    public int getAge(){
        Date today = new Date();
        return (int) miMetodo(today.getTime()-birthday.getTime());
    }
    
    private long miMetodo(long millis){
       return millis/MILLISECONDS_PER_YEAR;
    } 
}
