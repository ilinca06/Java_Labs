/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab22;

/**
 *
 * reprezinta o locatie specifica de tip statie gpl pe harta
 */
public final class GasStation extends Location {
    private double cost;
    public GasStation() {}
    public GasStation(String name, double x, double y, double cost)
    {
        super(name, x, y);
        this.cost=cost;
    }
    //setter si getter
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost=cost;
    }
    @Override
    public String toString()
    {
        return "GasStation= name= " + getName() + "  coord x= " + getX() + "  coord y= " + getY() + "  cost= " + cost;
    }
}
