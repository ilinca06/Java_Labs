/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package java_lab22;

/**
 *
 * Reprezinta o locatie specifica de tip oras pe harta
 */
public final class City extends Location {
    private int population;
    public City() {}
    public City(String name, double x, double y, int population)
    {
        super(name, x, y);
        this.population=population;
    }
    //setteri si getteri
    public int getPopulation()
    {
        return population;
    }
    public void setPopulation(int population)
    {
        this.population=population;
    }
    @Override
    public String toString()
    {
        return "City= name= " + getName() + "  coord x= " + getX() + "  coord y= " + getY() + "  populatie= " + population;
    }
}
