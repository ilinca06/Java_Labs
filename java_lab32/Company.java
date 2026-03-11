/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab32;

/**
 *
 * @author PC
 */
public class Company implements Profile, Comparable<Company> {
    private String name;
    private String industry;
    public Company(String name, String industry)
    {
        this.name=name;
        this.industry=industry;
    }
    //metoda din interfata profile
    @Override
    public String getName()
    {
        return name;
    }
    //getter pt industrie
    public String getIndustry()
    {
        return industry;
    }
    //metoda din interfata comparable
    @Override
    public int compareTo(Company other)
    {
        //comparam numeole alfabetic
        return this.name.compareTo(other.name);
    }
    //afisare
    @Override
    public String toString()
    {
        return "Company: " + name + "  Industry: " + industry;
    }        
}
