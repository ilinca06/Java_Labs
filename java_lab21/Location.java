/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab21;

/**
 * Represents a location in a cartesian coordinate system.
 * Contains coordinates, a name, and a specific type.
 */
public class Location {
    private String name;
    private LocationType type; // Aici folosim Enum-ul creat de tine mai devreme!
    private double x;
    private double y;

    /**
     * Constructor for creating a Location object.
     */
    public Location(String name, LocationType type, double x, double y) {
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    // --- Getters and Setters ---
    // Aceste metode 'public' ne permit sa citim sau sa modificam datele din exterior

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Overrides the default toString method from the Object class.
     * This ensures the object prints beautifully on the screen.
     */
    @Override
    public String toString() {
        return "Location{" + "name='" + name + '\'' + ", type=" + type + ", coordinates=(" + x + ", " + y + ")" + '}';
    }
}
