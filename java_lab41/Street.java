/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab41;

/**
 *
 * @author PC
 */
public class Street implements Comparable<Street> {
    private String name;
    private double length;
    private Intersection start;
    private Intersection end;
    
    public Street(String name, double length, Intersection start, Intersection end)
    {
        this.name=name;
        this.length=length;
        this.start=start;
        this.end=end;
    }
    public String getName()
    {
        return name;
    }
    public double getLength()
    {
        return length;
    }
    //ordonam strazile dupa lungime
    @Override
    public int compareTo(Street other)
    {
        return Double.compare(this.length, other.length);
    }
    @Override
    public String toString()
    {
        return "Street:  name: " + name + "  length: " + length;
    }
}
