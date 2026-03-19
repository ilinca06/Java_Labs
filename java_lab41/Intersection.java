/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab41;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Intersection implements Comparable<Intersection> {
    private String name;
    
    public Intersection(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    //ordonam alfabetic dupa nume
    @Override
    public int compareTo(Intersection other)
    {
        return this.name.compareTo(other.name);
    }
    //hashset:equals + hashcode
    @Override
    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass())
        {
            return false;
        }
        Intersection that=(Intersection) o;
        return Objects.equals(name, that.name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
    @Override
    public String toString()
    {
        return name;
    }
}
