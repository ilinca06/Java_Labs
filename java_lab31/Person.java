/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab31;

/**
 *
 * @author PC
 */
public class Person implements Profile, Comparable<Person> {
    private String name;
    public Person(String name)
    {
        this.name=name;
    }
    //metoda din interfata Profile
    @Override
    public String getName()
    {
        return name;
    }
    //metoda din interfata Comparable
    @Override
    public int compareTo(Person other)
    {
        //comparam numele alfabetic
        return this.name.compareTo(other.name);
    }
    //afisam pe ecran
    @Override
    public String toString()
    {
        return "Person= " + name;
    }
}
