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
public class Programmer extends Person  {
    private String favouriteLanguage;
    public Programmer(String name, LocalDate birthDate, String favouriteLanguage)
    {
        super(name, birthDate);
        this.favouriteLanguage=favouriteLanguage;
    }
    //getter pt a afla limba favorita
    public String getFavouriteLanguage()
    {
        return favouriteLanguage;
    }
    @Override
    public String toString()
    {
        return "Name: " + getName() + "  BirthDate: " + getBirthDate() + "  FavouriteLanguage: " + favouriteLanguage;
    }
}
