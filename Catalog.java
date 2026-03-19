/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab51.model;
import com.mycompany.java_lab51.exceptions.InvalidResourceException;
import java.awt.Desktop;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Catalog {
    //lista de resurse
    private List<Item> items = new ArrayList<>();

    //metoda de adaugare care arunca exceptia custom daca ceva nu e ok
    public void add(Item item) throws InvalidResourceException {
        //validam argumentele: daca nu are locatie, oprim totul si dam eroare
        if (item.getLocation() == null || item.getLocation().trim().isEmpty()) {
            throw new InvalidResourceException("Eroare! Resursa  " + item.getTitle() + "  nu are o locatie valida.");
        }
        
        items.add(item);
        System.out.println("A fost adaugat cu succes: " + item.getTitle());
    }

    public List<Item> getItems() {
        return items;
    }

    //metoda care deschide fisierul sau link-ul web
    public void open(Item item) {
        //verificam daca sistemul de operare suporta actiuni de Desktop
        if (!Desktop.isDesktopSupported()) {
            System.err.println("Desktop API nu este sustinut pe acest sistem!");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        String location = item.getLocation();

        //incercam sa deschidem resursa
        try {
            if (location.startsWith("http")) {
                //daca e link, il deschidem in browser
                desktop.browse(new URI(location)); 
            } else {
                //daca e fisier local, il deschidem cu programul default (ex: PDF Reader)
                desktop.open(new File(location)); 
            }
        } 
        catch (Exception e) 
        {
            //daca pica internetul sau fisierul nu exista
            System.err.println("A aparut o eroare la deschiderea resursei: " + e.getMessage());
        }
    }
}
