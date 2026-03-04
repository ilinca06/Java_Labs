/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab22;

/**
 *
 * reprezinta o locatie specifica de tip aeroport pe harta
 */
public final class Airport extends Location {
    private int terminal;
    public Airport() {}
    public Airport(String name, double x, double y, int terminal)
    {
        super(name, x, y);
        this.terminal=terminal;
    }
    //setter si getter
    public int getTerminal()
    {
        return terminal;
    }
    public void setTerminal(int terminal)
    {
        this.terminal=terminal;
    }
    @Override
    public String toString()
    {
        return "Airport= name= " + getName() + "  coord x= " + getX() + "  coord y= " + getY() + "  terminal= " + terminal;
    }
}
