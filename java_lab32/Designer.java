/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab32;
import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Designer extends Person  {
    private String favouriteSoftware;
    public Designer(String name, LocalDate birthDate, String favouriteSoftware)
    {
        super(name, birthDate);
        this.favouriteSoftware=favouriteSoftware;
    }
    //getter pt a afla sofware-ul favorit
    public String getFavouriteSoftware()
    {
        return favouriteSoftware;
    }
    @Override
    public String toString()
    {
        return "Name: " + getName() + "  BirthDate: " + getBirthDate() + "  FavouriteSoftware: " + favouriteSoftware;
    }
}
