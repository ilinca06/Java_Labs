/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab22;

/**
 *
 * reprezinta un drum care conecteaza 2 locatii pe harta
 */
public class Road {
    private RoadType type;
    private double length;
    private int speedLimit;
    private Location startLocation;
    private Location endLocation;
    public Road() {}
    public Road(RoadType type, double length, int speedLimit, Location startLocation, Location endLocation)
    {
        this.type=type;
        this.speedLimit=speedLimit;
        this.startLocation=startLocation;
        this.endLocation=endLocation;
        
        //calculam dintanta dintre cele doua locatii
        double distanta=Math.sqrt(Math.pow(startLocation.getX()- endLocation.getX(), 2) + Math.pow(startLocation.getY() - endLocation.getY(), 2));
        //ne asiguram ca lungimea nu e mai mica decat distanta
        if(length<distanta)
        {
            System.out.println("Eroare. Lungimea este mai mica decat distanta. O ajustam la distanta " + distanta);
            this.length=distanta;
        }
        else
        {
            this.length=length;
        }
    }
    //setteri si getteri
    public RoadType getType()
    {
        return type;
    }
    public void setType(RoadType type)
    {
        this.type=type;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public int getSpeedLimit()
    {
        return speedLimit;
    }
    public void setSpeedLimit(int speedLimit)
    {
        this.speedLimit=speedLimit;
    }
    public Location getStartLocation()
    {
        return startLocation;
    }
    public void setStartLocation(Location startLocation)
    {
        this.startLocation=startLocation;
    }
    public Location getEndLocation()
    {
        return endLocation;
    }
    public void setEndLocation(Location endLocation)
    {
        this.endLocation=endLocation;
    }
    
    @Override
    public String toString()
    {
        return "Road= type= " + type + "  length= " + length + "km  speedLimit= " + speedLimit + "km/h  startLocation= " + startLocation.getName() + "  endLocation= " + endLocation.getName();
    }
    
    @Override
    //verifica daca 2 drumuri sunt identice, adica drumul de la A ;a B e acelasi cu drumul de la B la A
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj==null || getClass() != obj.getClass())
        {
            return false;
        }
        Road other =(Road) obj;
        //verificam daca este acelasi drum, pleaca din acccasi locatie si ajunge in aceeasi locatie
        boolean sameDirection=this.startLocation.equals(other.startLocation) && this.endLocation.equals(other.endLocation);
        //verificam daca drumul este opus
        boolean oppositeDirection=this.startLocation.equals(other.endLocation) && this.endLocation.equals(other.startLocation);
        return sameDirection || oppositeDirection;
    }
    
    @Override
    public int hashCode()
    {
        //facem suma ca sa ne asiguramca A+B are acelasi hash cu B+A
        return this.startLocation.hashCode() + this.endLocation.hashCode();
    }
}
