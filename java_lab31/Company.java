/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab31;

/**
 *
 * @author PC
 */
public class Company implements Profile, Comparable<Company> {
    private String name;
    public Company(String name)
    {
        this.name=name;
    }
    //metoda din interfata Profile
    @Override
    public String getName()
    {
        return name;
    }
    //metoda din interfate Comparable
    @Override
    public int compareTo(Company other)
    {
        //comparam numele alfabetic
        return this.name.compareTo(other.name);
    }
    //afisare
    @Override
    public String toString()
    {
        return "Company= " + name;
    }
}
