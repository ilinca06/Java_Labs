/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab32;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class Person implements Profile, Comparable<Person> {
    private String name;
    private LocalDate birthDate;
    
    //adaugam o agenda de relatii
    //putem adauga firme si oameni in ea
    private Map<Profile, String> relationships;
    
    public Person(String name, LocalDate birthDate)
    {
        this.name=name;
        this.birthDate=birthDate;
        
        //initializam agenda cand se naste persoana
        this.relationships=new HashMap<>();
    }
    //metoda din interfata profile
    @Override
    public String getName()
    {
        return name;
    }
    //getter pt data de nastere
    public LocalDate getBirthDate()
    {
        return birthDate;
    }
    //metoda prin care persoana isi face o relatie noua
    public void addRelationship(Profile p, String type)
    {
        //punem in agenda profilul si tipul relatiei
        this.relationships.put(p, type);
    }
    //getter pentru a afla relatiile
    public Map<Profile, String> getRelationships()
    {
        return relationships;
    }
    //metoda din interfata comparable
    @Override
    public int compareTo(Person other)
    {
        //comparam numele alfabetic
        return this.name.compareTo(other.name);
    }
    //afisare
    @Override
    public String toString()
    {
        return "Person:" + name + "  BirthDate: " + birthDate;
    }
}
