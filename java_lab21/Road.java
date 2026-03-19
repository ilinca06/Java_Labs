/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab21;

/**
 * Represents a road connecting two locations.
 * Contains properties like type, length, speed limit, and the connected locations.
 */
public class Road {
    private RoadType type;
    private double length;
    private int speedLimit;
    private Location startLocation;
    private Location endLocation;

    /**
     * Constructor for creating a Road object.
     * Validates that the road length is not less than the Euclidean distance between locations.
     */
    public Road(RoadType type, double length, int speedLimit, Location startLocation, Location endLocation) {
        this.type = type;
        this.speedLimit = speedLimit;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        
        // Validarea distantei
        double euclidianDistance = calculateDistance();
        if (length < euclidianDistance) {
            System.out.println("Atentie: Lungimea drumului (" + length + ") e mai mica decat distanta in linie dreapta. Ajustam la: " + euclidianDistance);
            this.length = euclidianDistance;
        } else {
            this.length = length;
        }
    }

    /**
     * Calculates the Euclidean distance between startLocation and endLocation.
     */
    private double calculateDistance() {
        double dx = startLocation.getX() - endLocation.getX();
        double dy = startLocation.getY() - endLocation.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // --- Getters and Setters ---

    public RoadType getType() {
        return type;
    }

    public void setType(RoadType type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        // Poti adauga validarea si aici daca doresti!
        this.length = length;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    /**
     * Overrides the default toString method from the Object class.
     */
    @Override
    public String toString() {
        return "Road{" +
                "type=" + type +
                ", length=" + length +
                " km, speedLimit=" + speedLimit +
                " km/h, connects " + startLocation.getName() + 
                " to " + endLocation.getName() +
                '}';
    }
}
