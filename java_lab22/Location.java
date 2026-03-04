/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package java_lab22;

/**
 *
 * Clasa abstract si sealed ce reprezinta o locatie generica pe harta
 */


public abstract sealed class Location permits City, Airport, GasStation {
    private String name;
    private double x;
    private double y;
    
    public Location() {}
    //constructor pentru initializarea unei locatii
    public Location(String name, double x, double y)
    {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    //setteri si getteri
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y)
    {
        this.y=y;
    }
    @Override
    public String toString()
    {
        return "Location= name: " + name + "  coordonata x: " + x + "  coordonata y: " + y;
    }
    @Override
    //verifica daca 2 locatii au acelasi nume
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Location other = (Location) obj;
        if(this.name == null)
        {
            return other.name==null;
        }
        else
        {
            return this.name.equals(other.name);
        }
    }
    @Override
    //returneaza codul matematic al numelui
    public int hashCode()
    {
        if(this.name==null)
        {
            return 0;
        }
        else
        {
            return this.name.hashCode();
        }
    }
}
